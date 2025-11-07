package org.example.structural.composite;

abstract class BookComponent {

    String getName() {
        throw new UnsupportedOperationException();
    }

    String getAuthor() {
        throw new UnsupportedOperationException();
    }

    void add(BookComponent component) {
        throw new UnsupportedOperationException();
    }

    void remove(BookComponent component) {
        throw new UnsupportedOperationException();
    }

    BookComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    void about() {
        throw new UnsupportedOperationException();
    }
}
