package com.yto.test1;

import java.util.*;

/**
 * @author czw
 */
public class TestNul {
    /**
     * list判空
     * @param collection
     * @return
     */
    public static boolean isEmptyLsit(Collection<?> collection){

        return collection == null || collection.isEmpty();
    }

    public static boolean isEmptyMap(Map<?,?> map){
        return map ==null || isEmptyLsit(map.keySet());

    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("小崔");
        System.out.println(isEmptyLsit(list));
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"你好");
        System.out.println(isEmptyMap(map));
    }
}
