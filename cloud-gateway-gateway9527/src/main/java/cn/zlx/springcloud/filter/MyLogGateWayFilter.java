package cn.zlx.springcloud.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Description:
 * @author: zhonglianxi
 * @date: 2020-03-23
 */
@Component
//gateWay过滤器
public class MyLogGateWayFilter implements GlobalFilter,Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("***************come in MyLogGateWayFilter***********************");
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if (uname != null){
            System.out.println("*********error********** ");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
//            结束
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
//        加载过滤器顺序，数字越小，优先级越高
        return 0;
    }
}
