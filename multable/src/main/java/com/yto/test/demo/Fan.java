package com.yto.test.demo;

/**
 * @author czw
 */
public class Fan {
    public <T> T fan(T c)  {
        return c;
    }

    public static void main(String[] args) {
        Fan f =  new Fan();
        System.out.println(f.fan("杰克"));
        System.out.println(f.fan("123"));


    }

}
