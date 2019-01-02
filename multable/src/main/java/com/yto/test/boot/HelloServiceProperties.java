package com.yto.test.boot;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private  static  final  String MSG = "world";
    private  String msg = MSG;
    public void setMsg(String msg){
        this.msg = msg;
    }
    public  String getMsg(){
        return  msg;
    }
}
