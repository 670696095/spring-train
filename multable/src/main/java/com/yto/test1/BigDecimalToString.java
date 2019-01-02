package com.yto.test1;

import java.math.BigDecimal;

public class BigDecimalToString {
    public static void main(String[] args){
        /*String string = "1111";
        System.out.println(string);
        BigDecimal b1 = new BigDecimal("123.456777753413321231");
        System.out.println(b1);
        String result = b1.toString();
        System.out.println("result = "+result);*/
//        for (int i = 0; i <3 ; i++) {
//            System.out.println("niha");
//
//        }
        BigDecimal b = new BigDecimal(5.11);
        System.out.println(b.remainder(new BigDecimal(3)));
    }
}