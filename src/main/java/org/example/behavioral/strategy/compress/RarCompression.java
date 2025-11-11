package org.example.behavioral.strategy.compress;

public class RarCompression implements Compression {

    @Override
    public void compress(String file) {
        System.out.println("RAR compression: " + file);
    }
}
