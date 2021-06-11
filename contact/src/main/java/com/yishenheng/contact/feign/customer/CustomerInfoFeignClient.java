package com.yishenheng.contact.feign.customer;

import com.yishenheng.common.api.ResultData;
import com.yishenheng.contact.feign.customer.back.CustomerInfoBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yishenheng
 * @date 6/11/21 9:49 AM
 */
@FeignClient(value = "customer",fallback = CustomerInfoBack.class)
public interface CustomerInfoFeignClient {

    /**
     * 获取客户中所有的id集合
     *
     * @return id集合
     */
    @GetMapping("/customerInfo/queryCustomerIds")
    ResultData queryCustomerIds();
}
