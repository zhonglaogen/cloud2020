package cn.zlx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-19
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentzk(){
        return " consul cloud with consul" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
