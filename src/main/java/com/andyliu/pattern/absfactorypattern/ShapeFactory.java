package com.andyliu.pattern.absfactorypattern;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if (shape == null)
            return null;
        if (shape.equalsIgnoreCase("circle"))
            return new Circle();
        if (shape.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        if (shape.equalsIgnoreCase("SQUARE"))
            return new Sqare();
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
