package org.example.creational.abstractFactory;

public class LightTextField implements TextField{
    @Override
    public void render() {
        System.out.println("Rendering Light text field");
    }
}
