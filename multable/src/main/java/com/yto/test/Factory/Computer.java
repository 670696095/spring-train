package com.yto.test.Factory;

public class Computer {
    private output out;
    public Computer(output out){
        this.out = out;
    }
    public void keyIn(String msg){
        out.getData(msg);
    }
    public void print(){
        out.out();
    }


}
