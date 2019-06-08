package com.company;

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape_1=shapeFactory.getShape("rectangle");
        shape_1.draw();

        Shape shape_2=shapeFactory.getShape("circle");
        shape_2.draw();
    }
}
