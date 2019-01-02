package com.yto.test.collection.TreeSet;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new R(5));
        ts.add(new R(-3));
        ts.add(new R(9));
        ts.add(new R(-2));
        System.out.println(ts);
        R first =(R)ts.first();
        first.count = 20;
        R last =(R)ts.last();
        last.count = -2;
        System.out.println(ts);
        ts.remove(new R(-2));
        System.out.println(ts);
        ts.remove(new R(5));
        System.out.println(ts);

    }
}
