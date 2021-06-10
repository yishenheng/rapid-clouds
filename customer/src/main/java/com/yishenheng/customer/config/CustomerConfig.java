package com.yishenheng.customer.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import com.yishenheng.common.config.AbstractSwaggerConfig;
import com.yishenheng.common.dto.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author yishenheng
 * @date 6/10/21 4:06 PM
 */
@EnableSwagger2
@EnableKnife4j
@Configuration
@Import(BeanValidatorPluginsConfiguration.class)
public class CustomerConfig extends AbstractSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.yishenheng.customer.controller")
                .title("客户接口列表")
                .description("客户相关接口文档")
                .contactName("yishenheng")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }


}
