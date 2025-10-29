package org.example.behavioral.observer.market;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stock implements IObservable {
    StockInfo stockInfo;
    List<IObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(stockInfo);
        }
    }

    static class StockInfo {
        public int usd;
        public int eur;
    }

    public Stock() {
        stockInfo = new StockInfo();
    }

    public void setRate() {
        Random random = new Random();
        stockInfo.eur = random.nextInt(50) + 70;
        stockInfo.usd = random.nextInt(50) + 50;
        notifyObservers();
    }

}
