package org.example.structural.composite;

public class BookApp {
    public static void main(String[] args) {

        Book book1 = new Book("1", "Book1", "Author1");
        Book book2 = new Book("2", "Book2", "Author3");
        Book book3 = new Book("3", "Book3", "Author3");

        BookFolder bookFolder = new BookFolder("Main folder");
        bookFolder.add(book1);
        bookFolder.add(book2);
        bookFolder.add(book3);

        BookFolder subBookFolder = new BookFolder("Fantastic");
        subBookFolder.add(new Book("4", "NLO", "Mr.Black"));

        bookFolder.add(subBookFolder);

        bookFolder.about();
    }
}
