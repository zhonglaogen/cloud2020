package cn.zlx.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-22
 */
@Component
//当fegin的调用失败后，会默认走下面的实现方法，注意配置文件打开feign的Hystrix配置
public class PaymentFallbackService implements PaymentHytrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_TimeOut,o(╥﹏╥)o";
    }
}
