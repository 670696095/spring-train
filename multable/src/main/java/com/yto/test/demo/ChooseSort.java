package com.yto.test.demo;

/**
 * 选择排序
 * @author czw
 */
public class ChooseSort {
    public static void main(String[] args) {
        int [] arr = {6,3,8,2,9,1};
        System.out.println("排序前的数据是:");
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        System.out.println("排序后的数据是:");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
