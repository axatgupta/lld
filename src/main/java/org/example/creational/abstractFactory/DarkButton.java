package org.example.creational.abstractFactory;

public class DarkButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering a Dark button");
    }
}
