package org.example.creational.prototype.shape;

public class Square implements Shape {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public Shape clone() {
        return new Square(side);
    }
}
