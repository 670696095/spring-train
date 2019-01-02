package com.yto.test.Spring3;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author czw
 */
@Service
public class AsyncTaskService {
    @Async
    public void executeAsynvTask(Integer i){
        System.out.println("执行异步任务:   "+i);
    }
    @Async
    public void executeAsynvTaskPlus(Integer i){
        System.out.println("执行异步任务+1:   "+i+1);
    }
}
