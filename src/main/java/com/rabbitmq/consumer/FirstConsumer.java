package com.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/*
 * @ClassName
 * @Decription TOO 消息消费者
 * @Author HanniOvO
 * @Date 2019/7/16 19:27
 */
@Component
public class FirstConsumer {

    @RabbitListener(queues = {"first-queue","second-queue"}, containerFactory = "rabbitListenerContainerFactory")
    public void handleMessage(String message) throws Exception {
        // 处理消息
        System.out.println("FirstConsumer {} handleMessage :"+message);
    }


}
