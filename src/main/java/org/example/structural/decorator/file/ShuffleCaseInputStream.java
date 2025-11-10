package org.example.structural.decorator.file;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ShuffleCaseInputStream extends FilterInputStream {
    private boolean odd;

    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this INSTANCE is to be created without an underlying stream.
     */
    protected ShuffleCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int ch = super.read();
        odd = !odd;
        return (ch == -1) ? -1 : (odd ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);

        for (int i = off; i < len + off; i++) {
            odd = !odd;
            b[i] = (byte) (odd ? Character.toLowerCase(b[i]) : Character.toUpperCase(b[i]));
        }

        return result;
    }
}
