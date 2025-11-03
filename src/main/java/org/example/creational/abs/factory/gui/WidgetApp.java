package org.example.creational.abs.factory.gui;

public class WidgetApp {
    private static GuiFactory guiFactory;

    public static void main(String[] args) {
        int style = 1;

        switch (style) {
            case 1:
                guiFactory = new JetBlackFactory();
                break;
            case 2:
                guiFactory = new RoseGoldFactory();
                break;
        }

        Button button = guiFactory.createButton();
        ScrollBar scrollBar = guiFactory.createScrollBar();
        TextArea textArea = guiFactory.createTextArea();

        System.out.println(button.getClass());
        System.out.println(scrollBar.getClass());
        System.out.println(textArea.getClass());
        scrollBar.scrollTo(10);
    }
}
