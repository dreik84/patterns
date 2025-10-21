package org.example.structural.decorator.pizza;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public void about() {
        System.out.println(getDescription() + " " + getPrice());
    }
}
