package oop.lab03.shapes;

import java.math.*;
import oop.lab03.shapes.interfaces.Polygon;

public class Triangle implements Polygon{

    private static final int TRI_EDGES = 3;
    private static final double POWER_EXP = 2;
    private final double edge1;
    private final double edge2;
    private final double edge3;

    public Triangle(double edge1, double edge2, double edge3) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(Math.pow(this.edge1, POWER_EXP) + 
                Math.pow(this.edge2/2, POWER_EXP)) * this.edge3);
    }

    @Override
    public double getPerimeter() {
        return (this.edge1 + this.edge2 + this.edge3);
    }

    @Override
    public int getEdgeCount() {
        return TRI_EDGES;
    }

}
