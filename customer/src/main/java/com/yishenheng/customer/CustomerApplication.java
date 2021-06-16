package com.yishenheng.customer;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author yishenheng
 * @date 6/9/21 10:07 PM
 */
@SpringBootApplication(scanBasePackages = "com.yishenheng")
@Slf4j
@EnableDiscoveryClient
@MapperScan("com.yishenheng.customer.mapper")
@RefreshScope
public class CustomerApplication {

    public static void main(String[] args) {
        log.info("----------客户服务启动开始:{}", DateUtil.now());
        SpringApplication.run(CustomerApplication.class, args);
        log.info("----------客户服务启动结束:{}", DateUtil.now());
    }
}
