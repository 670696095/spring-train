package com.yto.test1;

import java.util.Scanner;

public class Test1112 {
    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test == null? null:test.trim();
    }

    private  String test;
    public static String remove(String resource,char ch)
    {
        StringBuffer buffer=new StringBuffer();
        int position=0;
        char currentChar;

        while(position<resource.length())
        {
            currentChar=resource.charAt(position++);
            //如果当前字符不是要去除的字符，则将当前字符加入到StringBuffer中
            if(currentChar!=ch) {
                buffer.append(currentChar);
            }
        }
        return buffer.toString();
    }
    public static void main(String args[]) {
//        String str= "afdsfdf 了   2012   0407 Alamps 老师";
//        char c=' ';
//        System.out.println("结果为："+Test1112.remove(str, c));
//        double x = 9.997;
//        System.out.println(Math.round(x));
//        String [] strings = {"1","2","3"};
//        System.out.println(String.join("-",strings));
//        String  greeting = "Hello";
//        String  s = greeting.substring(0,3)+"p!";
//        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String first = scanner.next();
        int age = scanner.nextInt();
        System.out.println(name);
        System.out.println(first);
        System.out.println(age);


    }
}
