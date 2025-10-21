package org.example.structural.decorator.pizza;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with cheese";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 12;
    }
}
