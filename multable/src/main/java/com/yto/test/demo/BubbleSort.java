package com.yto.test.demo;

/**
 * 冒泡排序
 * @author czw
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {6,3,8,2,9,1};
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }

        }
        System.out.println("冒泡排序后的数组是:");
        for (int i : arr) {
            System.out.println(i);
        }
    }


}
