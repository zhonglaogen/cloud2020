package cn.zlx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-18
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMainZk81 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainZk81.class,args);
    }
}
