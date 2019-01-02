package com.yto1114;

import java.util.Arrays;

public class TestCompare {
    public static void main(String[] args) {
        Comparator<String> comp =  new LengthComparator();
        System.out.println(comp.compare("123","4567"));

        String [] friends = {"c1","z22","w333"};
        Arrays.sort(friends, new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  o2.length()-o1.length();
            }
        });
        for (String friend : friends) {
            System.out.println(friend);
        }
        Arrays.sort(friends,(s1,s2)->(s1.length()-s2.length()) );
        for (String friend : friends) {
            System.out.println(friend);
        }
        Arrays.sort(friends,new LengthComparator());
        for (String friend : friends) {
            System.out.println(friend);
        }
    }

}
