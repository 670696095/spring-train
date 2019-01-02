package com.yto.test.HashMap;

import java.util.Hashtable;

/**
 * @author czw
 */
public class B {
    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(new A(6000),"疯狂java讲义");
        ht.put(new A(87563),"轻量级java EE企业应用实战");
        ht.put(new A(1232),new B());
        System.out.println(ht);
        System.out.println(ht.containsValue("测试字符串"));
        System.out.println(ht.containsKey(new A(87563)));
    }
}
