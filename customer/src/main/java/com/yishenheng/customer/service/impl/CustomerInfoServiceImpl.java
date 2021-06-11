package com.yishenheng.customer.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yishenheng.common.entity.CustomerInfo;
import com.yishenheng.customer.mapper.CustomerInfoMapper;
import com.yishenheng.customer.service.CustomerInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 客户详情表 服务实现类
 * </p>
 *
 * @author yishenheng
 * @since 2021-06-10
 */
@Service
@Slf4j
public class CustomerInfoServiceImpl extends ServiceImpl<CustomerInfoMapper, CustomerInfo> implements CustomerInfoService {

    @Value("${server.port}")
    private Integer port;

    @Override
    public List<String> queryIds() {
        log.info("请求的端口:{}",port);
        List<CustomerInfo> resultList = this.lambdaQuery()
                .select(CustomerInfo::getId)
                .list();
        if(CollUtil.isEmpty(resultList)){
            return null;
        }
        return resultList.stream().map(CustomerInfo::getId).collect(Collectors.toList());
    }
}
