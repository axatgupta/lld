package org.example.creational.abstractFactory;

public class DarkThemeFactory implements ThemeFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}
