package org.example.structural.decorator.pizza;

public class PepperoniPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Pepperoni Pizza";
    }

    @Override
    public int getPrice() {
        return 150;
    }

    @Override
    public void about() {
        System.out.println(getDescription() + " " + getPrice());
    }
}
