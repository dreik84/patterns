package org.example.structural.adapter.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Swing extends JFrame {

    public Swing() throws HeadlessException {
        setSize(800, 600);

        addWindowListener(new WindowAdapter() {

            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
                System.out.println("opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println("closed");
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Swing();
    }
}
