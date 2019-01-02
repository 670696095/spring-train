package com.yto1114;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czw
 */
public class LotterDrawing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int [] nums = new int[50];
        boolean [] flag = new boolean[50];
        int count = 0;
        for (int i = 0; i <50 ; i++) {
            nums [i] = i+1;
            flag [i] = true;
        }
        while (count!= 6){
            int k = (int)((Math.random())*50);
            if (flag[k]){
                list.add(nums[k]);
                flag[k] = false;
                count++;
            }
        }
        Object [] obj = list.toArray();
        System.out.print("["+"\t");
        for (int i = 0; i <obj.length ; i++) {
            System.out.print(obj[i]+"\t");
        }
        System.out.println("]");

    }
}
