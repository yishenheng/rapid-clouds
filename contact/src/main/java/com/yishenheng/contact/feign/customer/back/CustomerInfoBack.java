package com.yishenheng.contact.feign.customer.back;

import com.yishenheng.common.api.ResultData;
import com.yishenheng.contact.feign.customer.CustomerInfoFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author yishenheng
 * @date 6/11/21 1:44 PM
 */
@Component
@Slf4j
public class CustomerInfoBack implements CustomerInfoFeignClient {

    @Override
    public ResultData queryCustomerIds() {
        log.info("调用过程出现问题，服务降级处理");
        return ResultData.error("查询客户id集合失败，服务降级处理");
    }
}
