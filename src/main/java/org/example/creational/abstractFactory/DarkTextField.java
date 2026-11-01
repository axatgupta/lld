package org.example.creational.abstractFactory;

public class DarkTextField implements TextField{
    @Override
    public void render() {
        System.out.println("Rendering a dark text field");
    }
}
