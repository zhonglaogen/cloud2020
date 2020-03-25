package cn.zlx.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymenMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymenMain9002.class, args);
    }
}
