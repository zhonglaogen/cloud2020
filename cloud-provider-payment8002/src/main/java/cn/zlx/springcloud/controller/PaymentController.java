package cn.zlx.springcloud.controller;

import cn.zlx.springcloud.entities.CommonResult;
import cn.zlx.springcloud.entities.Payment;
import cn.zlx.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-16
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService. create(payment);
        log.info("******插入结果" + result);

        if (result > 0){
            return  new CommonResult(200,"success insert" + serverPort,result);
        }else {
            return  new CommonResult(444,"fail insert" + serverPort);
        }
    }


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> add(@PathVariable("id") Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("******查询结果" + result);

        if (result != null){
            return  new CommonResult(200,"successfind" + serverPort,result);
        }else {
            return  new CommonResult(444,"fail null record" + serverPort);
        }
    }

    @GetMapping("/payment/feign/timeout")
    public String timeout(){
        try{ TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){ e.printStackTrace();}
        return serverPort;
    }
}
