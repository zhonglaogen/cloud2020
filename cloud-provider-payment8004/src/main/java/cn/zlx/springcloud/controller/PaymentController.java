package cn.zlx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-18
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String paymentzk(){
        return " zkspringcloud with zookeeper" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
