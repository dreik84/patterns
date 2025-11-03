package org.example.creational.abs.factory.gui;

public class JetBlackFactory extends GuiFactory {

    @Override
    public Button createButton() {
        return new JetBlackButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new JetBlackScrollBar();
    }

    @Override
    public TextArea createTextArea() {
        return new JetBlackTextArea();
    }
}
