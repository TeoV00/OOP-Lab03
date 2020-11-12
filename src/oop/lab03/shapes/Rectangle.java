package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Rectangle implements Polygon{

    private static final int NUM_EDGES = 4;
    private static final double COUPLE_EDGE = 2;
    private final double b;
    private final double height;

    public Rectangle(double b, double height) {
        this.b = b;
        this.height = height;
    }

    public double getArea() {
        return (this.b * this.height);
    }

    @Override
    public double getPerimeter() {
        return ((this.b + this.height) * COUPLE_EDGE);
    }

    @Override
    public int getEdgeCount() {
        return NUM_EDGES;
    }

    public double getHeight() {
        return this.height;
    }

    public double getB() {
        return b;
    }
    
}
