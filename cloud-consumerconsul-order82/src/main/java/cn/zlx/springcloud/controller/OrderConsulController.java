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
public class OrderConsulController {


    public static final String INVOKE_RUL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String patmentInfo(){
        String result = restTemplate.getForObject(INVOKE_RUL + "/payment/consul",String.class);
        return  result;
    }


}
