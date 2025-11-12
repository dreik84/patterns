package org.example.behavioral.template.method.frame;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {

    public MyFrame() {
        super("Шаблонный метод");
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(100, 100, 200, 200);
        g.drawString("Learn Java", 200, 200);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}
