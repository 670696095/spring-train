package com.yto.test.Spring3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author czw
 */
public class Main1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i = 0; i < 10; i++) {
            asyncTaskService.executeAsynvTask(i);
            asyncTaskService.executeAsynvTaskPlus(i);
        }
        context.close();
    }
}
