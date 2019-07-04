package com.andyliu.pattern.singletompattern.lazysinglepattern;

public class SingletonSafe {
    private static SingletonSafe singleton;

    private SingletonSafe() {
        System.out.println("init");
    }

    public static synchronized SingletonSafe getInstance() {
        if (singleton == null) {
            singleton = new SingletonSafe();
        }
        return singleton;
    }

    public void show() {
        System.out.println("show ");
    }

    public static void main(String[] args) {
        SingletonSafe.getInstance().show();
        SingletonSafe.getInstance().show();
    }
}
