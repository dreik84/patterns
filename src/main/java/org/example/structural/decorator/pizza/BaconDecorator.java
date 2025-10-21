package org.example.structural.decorator.pizza;

public class BaconDecorator extends PizzaDecorator {

    public BaconDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with bacon";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 25;
    }
}
