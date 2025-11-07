package org.example.structural.composite;

class Book extends BookComponent {
    String isdn;
    String name;
    String author;
    int price;

    Book(String isdn, String name, String author) {
        this.isdn = isdn;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isdn='" + isdn + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    void about() {
        System.out.println(toString());
    }
}
