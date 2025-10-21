package org.example.structural.decorator.pizza;

public class PizzaApp {
    public static void main(String[] args) {

        Pizza pepperoniPizza = new PepperoniPizza();
        pepperoniPizza = new CheeseDecorator(pepperoniPizza);

        pepperoniPizza.about();

        pepperoniPizza  = new BaconDecorator(pepperoniPizza);

        pepperoniPizza.about();

        pepperoniPizza = new NoCheeseDecorator(pepperoniPizza);

        pepperoniPizza.about();
    }
}
