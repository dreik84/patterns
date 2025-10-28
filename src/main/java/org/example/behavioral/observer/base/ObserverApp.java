package org.example.behavioral.observer.base;

public class ObserverApp {
    public static void main(String[] args) {

        IObservable observable = new ConcreteObservable();
        IObserver observer1 = new ConcreteObserver("Misha");
        IObserver observer2 = new ConcreteObserver("Petya");
        IObserver observer3 = new ConcreteObserver("Anna");

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        pause();

        observable.notifyObservers();

        observable.removeObserver(observer1);

        observable.notifyObservers();
    }

    private static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
