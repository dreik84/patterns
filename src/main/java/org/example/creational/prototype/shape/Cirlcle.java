package org.example.creational.prototype.shape;

class Cirlcle implements Shape {
    private final int radius;

    Cirlcle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Shape clone() {
        return new Cirlcle(radius);
    }
}
