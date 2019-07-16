package com.rabbitmq.controller;

import com.rabbitmq.sender.FirstSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/*
 * @ClassName
 * @Decription TOO
 * @Author HanniOvO
 * @Date 2019/7/16 19:28
 */
@RestController
@Slf4j
public class RabbiltController {

    @Autowired
    private FirstSender firstSender;

    @GetMapping("/send")
    public String send(String message){
        log.info("发送消息=="+message);
        String uuid = UUID.randomUUID().toString();
        firstSender.send(uuid,message);
        return uuid+message;
    }

}
