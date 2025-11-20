package org.example.creational.prototype.shape;

import java.util.List;

class ShapeApp {
    public static void main(String[] args) {

        List<Shape> shapes = List.of(
                new Square(10),
                new Cirlcle(5)
        );

        List<Shape> newShapes = shapes.stream()
                .map(Shape::clone)
                .toList();

        System.out.println(newShapes);
    }
}
