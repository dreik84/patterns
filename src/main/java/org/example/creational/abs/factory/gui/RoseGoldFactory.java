package org.example.creational.abs.factory.gui;

public class RoseGoldFactory extends GuiFactory {
    @Override
    public Button createButton() {
        return new RoseGoldButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new RoseGoldScrollBar();
    }

    @Override
    public TextArea createTextArea() {
        return new RoseGoldTextArea();
    }
}
