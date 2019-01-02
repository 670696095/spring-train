package com.yto.test1;

import java.util.Arrays;

public class Test1114 {
    public static void main(String[] args) {
        int  [] a = {3,2,1};
      // smallPrimes =  new int [] {4,5,6};
        Arrays.sort(a);
        for (int smallPrime : a) {
            System.out.println("a:"+smallPrime);
        }

        int [] b = new int[10];
        for (int i = 0; i <10 ; i++) {
            b[i] = i+4;
        }
        for (int i : b) {
            System.out.println("b:"+i);
        }

        int [] c ;
        c = Arrays.copyOf(b,2*b.length);
        for (int i : c) {
            System.out.println("c:"+i);
        }


    }
}
