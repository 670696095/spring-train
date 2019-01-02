package com.yto.test.HashMap;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author czw
 */
public class C {
    public static void main(String[] args) {
        HashMap ht  =new HashMap();
        ht.put(new A(60000),"疯狂java讲义");
        ht.put(new A(87563),"轻量级");
        Iterator it = ht.keySet().iterator();
        A a = (A)it.next();
        a.count = 87563;
        System.out.println(ht);
        ht.remove(new A(87563));
        System.out.println(ht);
        System.out.println(ht.get(new A(87563)));
        System.out.println(ht.get(new A(60000)));

    }
}
