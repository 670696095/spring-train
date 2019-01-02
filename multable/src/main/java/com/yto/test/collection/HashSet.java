package com.yto.test.collection;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author czw
 */
public class HashSet {
    public static void main(String[] args) {
        Collection c = new java.util.HashSet();
        c.add("你好");
        c.add("java");
        c.forEach(obj -> System.out.println(obj));

        Iterator it = c.iterator();
        while(it.hasNext()){
            String book = (String) it.next();
            System.out.println(book);
            if(book.equals("你好")){
                it.remove();
            }
            book = "疯狂";
        }
        System.out.println(c);

        for (Object obj:c) {
            String book = (String)obj;
            System.out.println(book);
            if(book.equals("你好")){
                c.remove(book);
            }
        }
        System.out.println(c);
    }
}
