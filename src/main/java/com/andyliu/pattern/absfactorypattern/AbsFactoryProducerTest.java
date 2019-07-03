package com.andyliu.pattern.absfactorypattern;

public class AbsFactoryProducerTest {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("color");
        Color color = factory.getColor("red");
        color.fill();
    }
}
