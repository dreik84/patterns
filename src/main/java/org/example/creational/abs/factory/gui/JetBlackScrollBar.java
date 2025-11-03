package org.example.creational.abs.factory.gui;

public class JetBlackScrollBar extends ScrollBar {

    @Override
    public void scrollTo(int i) {
        System.out.println("JetBlack scrolling to " + i);
    }
}
