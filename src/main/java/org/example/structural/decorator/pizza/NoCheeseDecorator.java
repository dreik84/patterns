package org.example.structural.decorator.pizza;

public class NoCheeseDecorator extends PizzaDecorator {

    public NoCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription().replace("with cheese", "");
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() - 12;
    }
}
