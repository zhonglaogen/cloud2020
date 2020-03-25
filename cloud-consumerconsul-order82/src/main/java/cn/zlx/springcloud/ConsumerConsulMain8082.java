package cn.zlx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerConsulMain8082 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerConsulMain8082.class,args);
    }
}
