package com.yto.test.demo;

/**
 * 饿汉式
 */
public class Singleton1 {
    private  static Singleton1 instance  = new Singleton1();

    public Singleton1() {
    }
    public static Singleton1 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton1 s = getInstance();
        System.out.println(s);
    }
}
