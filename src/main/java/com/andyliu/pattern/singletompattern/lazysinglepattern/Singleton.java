package com.andyliu.pattern.singletompattern.lazysinglepattern;

public class Singleton {
    private static Singleton singleton;

    private Singleton() {
        System.out.println("init");
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void show() {
        System.out.println("show ");
    }

    public static void main(String[] args) {
        Singleton.getInstance().show();
        Singleton.getInstance().show();
    }
}
