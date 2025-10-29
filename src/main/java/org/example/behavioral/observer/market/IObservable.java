package org.example.behavioral.observer.market;

public interface IObservable {
    void addObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers();
}
