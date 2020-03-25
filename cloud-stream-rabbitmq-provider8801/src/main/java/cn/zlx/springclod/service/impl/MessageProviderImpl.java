package cn.zlx.springclod.service.impl;

import cn.hutool.core.lang.UUID;
import cn.zlx.springclod.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-23
 */
@EnableBinding(Source.class)  //定义消息的推送广告
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output; //消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: " +serial);
        return null;
    }
}