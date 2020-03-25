package cn.zlx.springcloud.myhandler;

import cn.zlx.springcloud.entities.CommonResult;
import cn.zlx.springcloud.entities.Payment;
import com.alibaba.csp.sentinel.slots.block.BlockException;


public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客户自定义,global handlerException", new Payment(2020L, "serial0003"));
    }
    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义2,global handlerException", new Payment(2020L, "serial0003"));
    }
}