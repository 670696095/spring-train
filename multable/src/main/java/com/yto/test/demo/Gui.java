package com.yto.test.demo;

public class Gui {
    public int fan(int n){
        if(n==1||n==2){
            return 1;
        }else {
            return fan(n-2)+fan(n-1);
        }

    }

    public static void main(String[] args) {
        Gui gui = new Gui();
        for (int i = 1; i <12 ; i++) {
            System.out.println(gui.fan(i));
        }
    }
}
