package cn.zlx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-22
 */
@SpringBootApplication
@EnableFeignClients
public class FeignOrderMain8080 {
    public static void main(String[] args) {
        SpringApplication.run(FeignOrderMain8080.class,args);
    }
}
