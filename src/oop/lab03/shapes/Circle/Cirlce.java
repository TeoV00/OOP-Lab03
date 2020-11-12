package oop.lab03.shapes.Circle;

import oop.lab03.shapes.interfaces.*;

public class Cirlce implements Shape{

    private static final double CONTS_MULTIPLIER = 2;
    private static final double AREA_EXP = 2;
    private final double radius;

    public Cirlce(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        
        return (Math.PI * Math.pow(this.radius, AREA_EXP));
    }

    @Override
    public double getPerimeter() {
        return (CONTS_MULTIPLIER * Math.PI *this.radius);
    }

    public double getRadius() {
        return this.radius;
    }
    
}
