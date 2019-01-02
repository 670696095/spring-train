package com.yto.test.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author czw
 */
public class Main3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        context.close();
    }

}
