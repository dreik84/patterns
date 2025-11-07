package org.example.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class BookFolder extends BookComponent {
    List<BookComponent> bookComponents = new ArrayList<>();
    String description;

    BookFolder(String description) {
        this.description = description;
    }

    @Override
    void add(BookComponent component) {
        bookComponents.add(component);
    }

    @Override
    void remove(BookComponent component) {
        bookComponents.remove(component);
    }

    @Override
    BookComponent getChild(int i) {
        return bookComponents.get(i);
    }

    @Override
    void about() {
        System.out.println("--" + description + "--");

        Iterator<BookComponent> iterator = bookComponents.iterator();

        while (iterator.hasNext()) {
            BookComponent component = iterator.next();
            component.about();
        }
    }
}
