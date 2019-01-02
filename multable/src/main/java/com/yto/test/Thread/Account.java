package com.yto.test.Thread;

/**
 * @author czw
 */
public class Account {
    /**
     * 定义一个ThreadLocal类型变量，该变量将是一个线程局部变量
     */
    private ThreadLocal<String> name = new ThreadLocal<>();

    public String getName() {
        return name.get();
    }

    public Account(String str) {
        this.name.set(str);
    }

    public void setName(String str) {
        this.name.set(str);
    }
}







