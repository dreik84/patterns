package org.example.behavioral.iterator;

public class Book {
    public String name;
    public String author;
    public int pubYear;

    public Book(String name, String author, int pubYear) {
        this.name = name;
        this.author = author;
        this.pubYear = pubYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pubYear=" + pubYear +
                '}';
    }
}
