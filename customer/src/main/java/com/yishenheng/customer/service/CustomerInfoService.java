package com.yishenheng.customer.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yishenheng.common.entity.CustomerInfo;

import java.util.List;

/**
 * <p>
 * 客户详情表 服务类
 * </p>
 *
 * @author yishenheng
 * @since 2021-06-10
 */
public interface CustomerInfoService extends IService<CustomerInfo> {

    /**
     * 获取客户详情中所有的id
     *
     * @return id集合
     */
    List<String> queryIds();
}
