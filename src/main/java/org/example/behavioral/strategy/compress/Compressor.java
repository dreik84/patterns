package org.example.behavioral.strategy.compress;

class Compressor {
    Compression compression;

    Compressor(Compression compression) {
        this.compression = compression;
    }

    public void compress(String file) {
        compression.compress(file);
    }
}
