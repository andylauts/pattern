package com.andyliu.pattern.singletompattern.hungrysinglepattern;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("init");
    }
    public static Singleton getSingleton(){
        return singleton;
    }

    public void show(){
        System.out.println("show");
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        singleton.show();
    }
}
