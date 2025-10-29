package org.example.behavioral.observer.market;

import java.util.Random;

public class Broker implements IObserver {
    IObservable stock;
    String name;

    public Broker(IObservable stock, String name) {
        this.stock = stock;
        this.name = name;
        stock.addObserver(this);
    }

    @Override
    public void update(Object o) {
        Stock.StockInfo stockInfo = (Stock.StockInfo) o;

        if (stockInfo.usd > (30 + new Random().nextInt(60))) {
            System.out.println("Broker " + name + " sell " + stockInfo.usd);
        } else {
            System.out.println("Broker " + name + " buy " + stockInfo.usd);
        }
    }
}
