package com.andyliu.pattern.factorypattern;

public class CarFactory {
    public static Car createCar(String brind) {
        if ("benz".equalsIgnoreCase(brind))
            return new Benz();
        if ("bmw".equalsIgnoreCase(brind))
            return new Bmw();
        if ("ford".equalsIgnoreCase(brind))
            return new Ford();
        return null;

    }
}
