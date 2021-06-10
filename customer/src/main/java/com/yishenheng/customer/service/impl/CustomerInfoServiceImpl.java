package com.yishenheng.customer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yishenheng.common.entity.CustomerInfo;
import com.yishenheng.customer.mapper.CustomerInfoMapper;
import com.yishenheng.customer.service.CustomerInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户详情表 服务实现类
 * </p>
 *
 * @author yishenheng
 * @since 2021-06-10
 */
@Service
public class CustomerInfoServiceImpl extends ServiceImpl<CustomerInfoMapper, CustomerInfo> implements CustomerInfoService {

}
