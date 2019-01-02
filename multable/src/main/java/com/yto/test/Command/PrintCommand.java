package com.yto.test.Command;

/**
 * @author czw
 */
public class PrintCommand implements Command {
    @Override
    public void process(int[] target) {
        for(int tmp : target){
            System.out.println("迭代输出" +tmp);
        }
    }
}
