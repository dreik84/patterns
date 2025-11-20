package org.example.creational.prototype.shape;

interface Shape extends Cloneable<Shape> {
    double getArea();
    Shape clone();
}
