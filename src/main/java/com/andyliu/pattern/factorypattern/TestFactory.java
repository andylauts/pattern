package com.andyliu.pattern.factorypattern;

public class TestFactory {
    public static void main(String[] args) {
        CarFactory.createCar("bmw").run();
    }
}
