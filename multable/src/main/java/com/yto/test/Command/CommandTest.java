package com.yto.test.Command;

public class CommandTest {
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int [] tatget ={1,2,3,4,5};
        pa.process(tatget,new PrintCommand());
        pa.process(tatget,new AddCommand());
    }
}
