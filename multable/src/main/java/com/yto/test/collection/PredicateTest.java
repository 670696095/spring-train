package com.yto.test.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * @author czw
 */
public class PredicateTest {
    public static int callAll(Collection books, Predicate p) {
        int total = 0;
        for (Object obj : books) {
            if (p.test(obj)) {
                total++;
            }
        }
        return  total;
    }

    public static void main(String[] args) {
        Collection c= new HashSet();
        c.add("疯狂java讲义");
        c.add("疯狂AJAX讲义");
        c.add("疯狂Android讲义");
        c.add("疯狂ios讲义");
        c.add("疯狂HTML讲义");
        System.out.println(callAll(c,ele ->((String)ele).contains("疯狂")));
        System.out.println(callAll(c,ele ->((String)ele).length()>10));

    }



}
