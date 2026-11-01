package org.example.creational.abstractFactory;

public class LightButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering a light button");
    }
}
