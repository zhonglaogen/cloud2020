package cn.zlx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-23
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMq8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMq8803.class, args);
    }
}
