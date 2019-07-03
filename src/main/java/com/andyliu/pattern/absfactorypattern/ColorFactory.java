package com.andyliu.pattern.absfactorypattern;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if ("red".equalsIgnoreCase(color))
            return new Red();
        if ("blue".equalsIgnoreCase(color))
            return new Blue();
        if ("green".equalsIgnoreCase(color))
            return new Green();

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
