package com.yto.test.Command;

public class AddCommand implements Command {
    @Override
    public void process(int[] target) {
        int sum = 0;
        for (int tem : target){
            sum += tem;
        }
        System.out.println(sum);
    }
}
