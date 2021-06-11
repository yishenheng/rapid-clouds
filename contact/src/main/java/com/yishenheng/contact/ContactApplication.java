package com.yishenheng.contact;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yishenheng
 * @date 6/10/21 3:10 PM
 */
@SpringBootApplication(scanBasePackages = "com.yishenheng")
@EnableDiscoveryClient
@Slf4j
@MapperScan("com.yishenheng.contact.mapper")
@EnableFeignClients
@EnableCircuitBreaker
public class ContactApplication {

    public static void main(String[] args) {
        log.info("----------开始启动联系人服务:{}", DateUtil.now());
        SpringApplication.run(ContactApplication.class,args);
        log.info("---------结束启动联系人服务：{}",DateUtil.now());
    }
}
