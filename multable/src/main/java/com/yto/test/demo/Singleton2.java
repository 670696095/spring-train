package com.yto.test.demo;

public enum Singleton2 {
    instance;

    private Singleton2() {
    }

    public  void Method(){
        System.out.println("你好");
    }

    public static void main(String[] args) {
        instance.Method();
    }
}
