package org.example.creational.bad.practice.javabeans;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Car();

        car.setModel("Mustang");
        car.setEngine("3.6");
        car.setInterior("Leather");
        car.setHasSunroof(true);
        car.setColor("Silver Metallic");

        System.out.println(car);
    }
}

class Car { // Ford
    private String model;
    private String engine;
    private String interior;
    private boolean hasSunroof;
    private String color = "Black";

    public void setColor(String color) {
        this.color = color;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
