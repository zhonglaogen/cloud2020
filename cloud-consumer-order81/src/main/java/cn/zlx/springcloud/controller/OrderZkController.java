package cn.zlx.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-18
 */
@RestController
public class OrderZkController {


    public static final String INVOKE_RUL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String patmentInfo(){
        String result = restTemplate.getForObject(INVOKE_RUL + "/payment/zk",String.class);
        return  result;
    }


}
