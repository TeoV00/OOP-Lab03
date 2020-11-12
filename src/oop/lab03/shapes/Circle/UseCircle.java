package oop.lab03.shapes.Circle;

import oop.lab03.shapes.interfaces.Shape;

public class UseCircle {

    public static void main(String[] args) {
        
        Shape cirlce = new Cirlce(3.0);

        System.out.println("Perim: " + cirlce.getPerimeter());
        System.out.println("The area is: " + cirlce.getArea());

    }

}
