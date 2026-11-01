package org.example.creational.abstractFactory;

public class Application {
    private final Button button;
    private final TextField textField;

    public Application(ThemeFactory factory){
        this.button = factory.createButton();
        this.textField = factory.createTextField();
    }

    public void renderUI(){
        button.render();
        textField.render();
    }
}
