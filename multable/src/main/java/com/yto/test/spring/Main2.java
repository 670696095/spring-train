package com.yto.test.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig re = context.getBean(ElConfig.class);
        re.outputResource();
        context.close();
    }

}
