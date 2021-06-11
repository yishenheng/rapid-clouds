package com.yishenheng.contact.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yishenheng.common.dto.ContactInfoDTO;
import com.yishenheng.common.entity.ContactInfo;
import com.yishenheng.common.exception.BusinessException;
import com.yishenheng.contact.feign.customer.CustomerInfoFeignClient;
import com.yishenheng.contact.mapper.ContactInfoMapper;
import com.yishenheng.contact.service.ContactInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 联系人详情 服务实现类
 * </p>
 *
 * @author yishenheng
 * @since 2021-06-10
 */
@Service
public class ContactInfoServiceImpl extends ServiceImpl<ContactInfoMapper, ContactInfo> implements ContactInfoService {

    @Resource
    private CustomerInfoFeignClient customerInfoFeignClient;

    @Override
    public void saveContactInfo(ContactInfoDTO saveParam) {
        List<String> customerIds = (List<String>)this.customerInfoFeignClient.queryCustomerIds().getData();
        if(CollUtil.isEmpty(customerIds) || !customerIds.contains(saveParam.getCustomerId())){
            throw new BusinessException("客户id不存在");
        }
        this.save(saveParam);
    }
}
