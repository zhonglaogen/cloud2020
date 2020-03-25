package cn.zlx.springcloud.service;

import cn.zlx.springcloud.config.FeignConfig;
import cn.zlx.springcloud.entities.CommonResult;
import cn.zlx.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-22
 */

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE", configuration = FeignConfig.class)
public interface PaymentService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> add(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    public String timeout();
}
