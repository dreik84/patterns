package org.example.behavioral.iterator;

import java.util.Iterator;

public class BookApp {
    public static void main(String[] args) {

        Book book1 = new Book("Book1", "John", 1857);
        Book book2 = new Book("Book2", "Tom", 1958);
        Book book3 = new Book("Book3", "Jake", 2011);

        BookShelf bookShelf = new BookShelf();

        bookShelf.addBook(book1);
        bookShelf.addBook(book2);
        bookShelf.addBook(book3);

        Iterator<Book> iterator = bookShelf.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
