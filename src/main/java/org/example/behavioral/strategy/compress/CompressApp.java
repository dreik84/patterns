package org.example.behavioral.strategy.compress;

public class CompressApp {
    public static void main(String[] args) {
//        Compression compression = new RarCompression();
        Compression compression = new ZipCompression();
        Compressor compressor = new Compressor(compression);
        compressor.compress("file");
    }
}
