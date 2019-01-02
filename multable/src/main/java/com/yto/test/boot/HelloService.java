package com.yto.test.boot;

public class HelloService {
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private  String msg;
    public  String sayHello(){
        return  "Hello    "+msg;
    }
}
