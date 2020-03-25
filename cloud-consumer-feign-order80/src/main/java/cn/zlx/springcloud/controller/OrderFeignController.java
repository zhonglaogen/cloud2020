package cn.zlx.springcloud.controller;

import cn.zlx.springcloud.entities.CommonResult;
import cn.zlx.springcloud.entities.Payment;
import cn.zlx.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-22
 */
@RestController
public class OrderFeignController {
    @Resource
    private PaymentService paymentService;


    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> add(@PathVariable("id") Long id){
        return paymentService.add(id);
    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String timeout(){
//        openfeign默认等待1秒
        return paymentService.timeout();
    }
}
