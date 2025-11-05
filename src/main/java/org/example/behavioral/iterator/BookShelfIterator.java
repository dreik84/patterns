package org.example.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelfIterator implements Iterator<Book> {
    List<Book> books = new ArrayList<>();
    int position;

    public BookShelfIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.size() && books.get(position) != null;
    }

    @Override
    public Book next() {
        Book book = books.get(position);
        position++;
        return book;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
