package com.yto.test.spring;

public class UserFunctionService {
    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    FunctionService functionService;

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
