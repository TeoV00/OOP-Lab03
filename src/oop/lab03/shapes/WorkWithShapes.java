package oop.lab03.shapes;

import oop.lab03.shapes.Circle.Cirlce;
import oop.lab03.shapes.interfaces.Polygon;
import oop.lab03.shapes.interfaces.Shape;

public class WorkWithShapes {

    public static void main(String[] args) {
        
        Shape circle = new Cirlce(4.0);
        Polygon square = new Square(2.0);
        Polygon rectangular = new Rectangle(3.0, 4.0);
        Polygon triangle = new Triangle(3.0, 4.0, 5.0,6.0);
        Shape squareShape = square;
        
        System.out.println("Circle Area: " + circle.getArea() + " Perimetro: " + circle.getPerimeter());
        System.out.println("square Area: " + square.getArea() + " Perimetro: " + square.getPerimeter());
        System.out.println("squareShape Area: " + squareShape.getArea() + " Perimetro: " + squareShape.getPerimeter());
        System.out.println("rectangular Area: " + rectangular.getArea() + " Perimetro: " + rectangular.getPerimeter());
        System.out.println("triangle Area: " + triangle.getArea() + "Perimetro: " + triangle.getPerimeter());
    }
}
