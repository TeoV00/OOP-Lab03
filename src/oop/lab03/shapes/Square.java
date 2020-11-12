package oop.lab03.shapes;

import oop.lab03.shapes.interfaces.Polygon;

public class Square implements Polygon{

    private static final int SQUARE_EDGES = 4;
    private final double edgeLen;
    
    public Square(double edgeLen) {
        this.edgeLen = edgeLen;
    }

    public double getArea() {
        return (this.edgeLen * this.edgeLen);
    }

    @Override
    public double getPerimeter() {
        return (this.edgeLen * SQUARE_EDGES);
    }

    @Override
    public int getEdgeCount() {
        return SQUARE_EDGES;
    }

}
