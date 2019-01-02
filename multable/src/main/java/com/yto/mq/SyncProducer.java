package com.yto.mq;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

/**
 * @author czw
 */
public class SyncProducer {
    public static void main(String[] args) throws Exception {
        DefaultMQProducer  producer  = new DefaultMQProducer("cuizhiwen");
        producer.setNamesrvAddr("localhost:9876");
        try {
            producer.start();
        } catch (MQClientException e) {
            e.printStackTrace();
        }
        for (int i = 0;i<10 ;i++){
            Message message = new Message("TopicTest","TagA",("hello RocketMQ" +i).getBytes(RemotingHelper.DEFAULT_CHARSET));
            SendResult sendResult = producer.send(message);
            System.out.println(sendResult);
        }
        producer.shutdown();
    }
}
