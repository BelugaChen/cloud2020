package com.beluga.cloud.service.impl;

import com.beluga.cloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import java.util.UUID;

/**
 * @author: 陈健Beluga.
 * @date: 2020/4/11 16:13.
 */
@EnableBinding(Source.class)
@Slf4j
public class MessageProviderImpl implements IMessageProvider {

    /**
     * 消息发送管道
     */
    @Autowired
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("**************************serial: " + serial);
        return null;
    }
}
