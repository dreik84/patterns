package org.example.structural.decorator.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ShuffleApp {
    public static void main(String[] args) {
        int ch;

        try (
                InputStream inputStream = new ShuffleCaseInputStream(
                        new BufferedInputStream(
                                new FileInputStream("src/main/resources/test.txt")))) {

            while ((ch = inputStream.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
