package com.yto.test.Thread;

/**
 * @author czw
 */
public class ThreadLocalTest {
    public static void main(String[] args) {
        Account at = new Account("初始名");
        new MyTest(at,"线程A").start();
        new MyTest(at,"线程B").start();
    }
}
