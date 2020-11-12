package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Triangle implements Polygon{

    private static final int TRI_EDGES = 3;
    private static final double DIVIDER_AREA_TRI = 2;
    private final double b;
    private final double h;
    private final double edge1;
    private final double edge2;

    public Triangle(double b, double h, double edge1, double edge2) {
        this.b = b;
        this.h = h;
        this.edge1 = edge1;
        this.edge2 = edge2;
    }

    @Override
    public double getArea() {
        return (this.b * this.h) / DIVIDER_AREA_TRI;
    }

    @Override
    public double getPerimeter() {
        return (this.edge1 + this.edge2 + this.b);
    }

    @Override
    public int getEdgeCount() {
        return TRI_EDGES;
    }

}
