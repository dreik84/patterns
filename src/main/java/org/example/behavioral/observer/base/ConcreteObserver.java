package org.example.behavioral.observer.base;

public class ConcreteObserver implements IObserver {
    private final String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void handle() {
        System.out.println(name);
    }
}
