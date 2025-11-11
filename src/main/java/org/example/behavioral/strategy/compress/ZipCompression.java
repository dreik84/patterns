package org.example.behavioral.strategy.compress;

public class ZipCompression implements Compression {

    @Override
    public void compress(String file) {
        System.out.println("ZIP compression: " + file);
    }
}
