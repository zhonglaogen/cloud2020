package cn.zlx.springcloud.service.impl;

import cn.zlx.springcloud.dao.PaymentDao;
import cn.zlx.springcloud.entities.Payment;
import cn.zlx.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-16
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
