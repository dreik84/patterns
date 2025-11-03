package org.example.creational.abs.factory.gui;

public class RoseGoldScrollBar extends ScrollBar {

    @Override
    public void scrollTo(int i) {
        System.out.println("RoseGold scrolling to " + i);
    }
}
