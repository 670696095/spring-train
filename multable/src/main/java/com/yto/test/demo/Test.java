package com.yto.test.demo;

/**
 * @author czw
 */
public class Test {

    public static void sort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
    }
    public static double avg(int [] arr){
        double d = 0;
        for (int i = 0; i < arr.length; i++) {
            d+=arr[i];
        }
        return d/arr.length;
    }

    public static void main(String[] args) {
        int [] arr = {6,3,8,2,9,1};
        System.out.println("排序前的数组数据:");
        for (int i : arr) {
            System.out.println(i);
        }
        sort(arr);
        System.out.println("排序后的数组数据:");
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("平均值是:");
        System.out.println(avg(arr));
    }
}
