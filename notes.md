# Structural Patterns: Test Notes

How to use: replace the whole of `src/main/java/org/example/Main.java` with the code below and run `main`.
Each pattern has its own `testXxx()` method. Comment out a call in `main` to run one pattern at a time.

> The import list is the full set needed. Don't keep the old imports: `org.example.creational.factory.Payment`
> and `org.example.structural.facade.Payment` have the same class name and would clash if both were imported.
> The facade test takes about 12 seconds because `OrderFacade` calls `Thread.sleep(2000)` between steps.

## Code

```java
package org.example;

import org.example.structural.adapter.PaymentProcessor;
import org.example.structural.adapter.PaypalAdapter;
import org.example.structural.adapter.PaytmAdapter;
import org.example.structural.adapter.PhonepeAdapter;
import org.example.structural.adapter.RazorpayAdapter;
import org.example.structural.adapter.StripeAdapter;
import org.example.structural.composite.Item;
import org.example.structural.composite.ProductBundle;
import org.example.structural.decorator.BasicProduct;
import org.example.structural.decorator.ElectronicProduct;
import org.example.structural.decorator.ExtendedWarranty;
import org.example.structural.decorator.GiftWrap;
import org.example.structural.decorator.Insurance;
import org.example.structural.decorator.PrimeDelivery;
import org.example.structural.decorator.Product;
import org.example.structural.facade.OrderFacade;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        testAdapter();
        testDecorator();
        testComposite();
        testCompositeWithDecorator();
        testFacade();
    }

    // ---------------- ADAPTER ----------------
    static void testAdapter() {
        System.out.println("\n========== ADAPTER ==========");
        List<PaymentProcessor> processors = List.of(
                new PaypalAdapter(),
                new PaytmAdapter(),
                new PhonepeAdapter(),
                new RazorpayAdapter(),
                new StripeAdapter()
        );
        for (PaymentProcessor processor : processors) {
            processor.pay(500.0);
        }

        // Singleton check: the "Initializing ..." line must NOT print again here
        System.out.println("-- creating a second PaytmAdapter (should not re-initialize Paytm) --");
        new PaytmAdapter().pay(100.0);
    }

    // ---------------- DECORATOR ----------------
    static void testDecorator() {
        System.out.println("\n========== DECORATOR ==========");
        Product phone = new BasicProduct("iPhone", 1000.0);
        System.out.println("Base      : " + phone.description() + " | " + phone.price());

        Product decorated = new PrimeDelivery(
                new GiftWrap(
                        new Insurance(
                                new ExtendedWarranty(phone))));
        System.out.println("Decorated : " + decorated.description());
        System.out.println("Price     : " + decorated.price() + "  (expected 1310.0 = 1000 + 100 + 150 + 10 + 50)");

        // Same decorator applied twice stacks the cost
        Product doubleWrap = new GiftWrap(new GiftWrap(new BasicProduct("Book", 200.0)));
        System.out.println("Double wrap price: " + doubleWrap.price() + "  (expected 220.0)");

        // Known issue: ElectronicProduct is a stub -> prints empty description and 0.0
        Product laptop = new ElectronicProduct("Laptop", 50000.0);
        System.out.println("ElectronicProduct: '" + laptop.description() + "' | " + laptop.price()
                + "  (expected 'Laptop' | 50000.0 once implemented)");
    }

    // ---------------- COMPOSITE ----------------
    static void testComposite() {
        System.out.println("\n========== COMPOSITE ==========");
        ProductBundle starterKit = new ProductBundle("Starter Kit");
        starterKit.addToProductList(new Item(300.0, "Keyboard"));
        starterKit.addToProductList(new Item(200.0, "Mouse"));

        // Nested bundle: a bundle inside a bundle
        ProductBundle officeSetup = new ProductBundle("Office Setup");
        officeSetup.addToProductList(starterKit);
        officeSetup.addToProductList(new Item(1500.0, "Monitor"));

        System.out.println("Description: " + officeSetup.description());
        System.out.println("Total price: " + officeSetup.price() + "  (expected 2000.0)");

        ProductBundle empty = new ProductBundle("Empty Bundle");
        System.out.println("Empty bundle price: " + empty.price() + "  (expected 0.0)");
    }

    // ---------------- COMPOSITE + DECORATOR ----------------
    static void testCompositeWithDecorator() {
        System.out.println("\n========== COMPOSITE + DECORATOR ==========");
        ProductBundle giftBox = new ProductBundle("Gift Box");
        giftBox.addToProductList(new Item(400.0, "Perfume"));
        // a decorated product inside a bundle
        giftBox.addToProductList(new GiftWrap(new Item(600.0, "Watch")));

        // a whole bundle wrapped by decorators
        Product wrappedBox = new PrimeDelivery(new GiftWrap(giftBox));
        System.out.println("Description: " + wrappedBox.description());
        System.out.println("Price      : " + wrappedBox.price() + "  (expected 1070.0 = 400 + 610 + 10 + 50)");
    }

    // ---------------- FACADE ----------------
    static void testFacade() {
        System.out.println("\n========== FACADE ==========");
        OrderFacade facade = new OrderFacade();
        Product order = new GiftWrap(new BasicProduct("Headphones", 2000.0));

        System.out.println("-- placeOrder --");
        facade.placeOrder(order);

        // Known issue: cancelOrder currently re-ships and charges again instead of refunding
        System.out.println("-- cancelOrder --");
        facade.cancelOrder(order);
    }
}
```

## Expected output (from an actual run)

```text

========== ADAPTER ==========
Initializing one Paypal instance ...
Initialising Paytm Instance ... 
Initializing one Phonepe instance ...
Initializing one razorpay instance ...
Initializing one Stripe instance ...
Payment of : 500.0 has been paid by Paypal!
Paid : 500.0 through Paytm
Payment of : 500.0 has been paid by Phonepe!
Payment of : 500.0 has been paid by Razorpay!
Payment of : 500.0 has been paid by Stripe!
-- creating a second PaytmAdapter (should not re-initialize Paytm) --
Paid : 100.0 through Paytm

========== DECORATOR ==========
Base      : iPhone | 1000.0
Decorated : iPhone Adding extended warranty to the product.  now has insurance applied. also adding a gift wrap to it.Added prime delivery
Price     : 1310.0  (expected 1310.0 = 1000 + 100 + 150 + 10 + 50)
Double wrap price: 220.0  (expected 220.0)
ElectronicProduct: '' | 0.0  (expected 'Laptop' | 50000.0 once implemented)

========== COMPOSITE ==========
Keyboard
Mouse
Starter Kit
Monitor
Description: Office Setup
Total price: 2000.0  (expected 2000.0)
Empty bundle price: 0.0  (expected 0.0)

========== COMPOSITE + DECORATOR ==========
Perfume
Watch also adding a gift wrap to it.
Description: Gift Box also adding a gift wrap to it.Added prime delivery
Price      : 1070.0  (expected 1070.0 = 400 + 610 + 10 + 50)

========== FACADE ==========
-- placeOrder --
Order is successfully placed!
 Now processing : Headphones also adding a gift wrap to it.
Processing the payment for : 2010.0
Inventory updated for the item : Headphones also adding a gift wrap to it.
Arranging the shipping for this item  : Headphones also adding a gift wrap to it.
-- cancelOrder --
 Now processing : Headphones also adding a gift wrap to it.
Inventory updated for the item : Headphones also adding a gift wrap to it.
Arranging the shipping for this item  : Headphones also adding a gift wrap to it.
Processing the payment for : 2010.0
Order is successfully cancelled!
```

## What to check

| Pattern | Looks right if... | Known issue visible in the output |
|---|---|---|
| Adapter | Each gateway prints its "Initializing" line only once, and the second `PaytmAdapter` doesn't print it again | None |
| Decorator | Price is `1310.0`, and double gift wrap is `220.0` | `ElectronicProduct` prints `'' \| 0.0` because it's a stub. "...to it.Added prime delivery" is missing a space |
| Composite | Total is `2000.0` and an empty bundle is `0.0` | Child names are printed by `description()` itself and aren't part of the returned string |
| Composite + Decorator | Price is `1070.0` | Same printing side effect as above |
| Facade | `placeOrder` runs payment, then inventory, then shipping | `cancelOrder` arranges shipping and processes payment **again** instead of refunding |

After you fix one of the known issues, its line in the output should change. For example, `ElectronicProduct` should print `'Laptop' | 50000.0`.
