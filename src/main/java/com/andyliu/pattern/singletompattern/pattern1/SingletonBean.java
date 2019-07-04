package com.andyliu.pattern.singletompattern.pattern1;

public class SingletonBean {
    private static final SingletonBean singletonBean = new SingletonBean();

    public static SingletonBean getInstance() {
        return singletonBean;
    }

    private SingletonBean() {
        System.out.println("init");
    }

    public void showBean() {
        System.out.println("SingletonBean");
    }

    public static void main(String[] args) {
        SingletonBean.getInstance().showBean();
//        SingletonBean.getInstance().showBean();
   }
}
