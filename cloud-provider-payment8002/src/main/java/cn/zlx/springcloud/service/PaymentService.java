package cn.zlx.springcloud.service;

import cn.zlx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-16
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
