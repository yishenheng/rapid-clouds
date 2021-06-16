package com.yishenheng.gateway;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yishenheng
 * @date 6/11/21 4:03 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class GatewayApplication {
    public static void main(String[] args) {
        log.info("----------开始启动gateway服务 start:{}", DateUtil.now());
        SpringApplication.run(GatewayApplication.class,args);
        log.info("----------结束启动gateway服务 end:{}",DateUtil.now());
    }
}
