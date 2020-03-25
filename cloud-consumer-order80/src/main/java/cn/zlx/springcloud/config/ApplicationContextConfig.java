package cn.zlx.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-16
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
//    负责选择服务集群的负载均衡方式
    @LoadBalanced
    public RestTemplate getRestTemolate(){
        return new RestTemplate();
    }
}
