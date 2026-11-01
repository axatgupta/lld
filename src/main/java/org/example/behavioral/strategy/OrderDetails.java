package org.example.behavioral.strategy;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class OrderDetails {
    private final double amount;
    private final String userType; // to enable specific type of coupons to specific userType
    private final List<String> coupon;
}
