package org.example.behavioral.observer.market;

public class MarketApp {
    public static void main(String[] args) {
        Stock stock = new Stock();

        IObserver broker1 = new Broker(stock, "John");
        IObserver broker2 = new Broker(stock, "Tom");
        IObserver broker3 = new Broker(stock, "Alica");

        pause();
        stock.setRate();

        pause();
        stock.setRate();

        pause();
        stock.setRate();
    }

    private static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
