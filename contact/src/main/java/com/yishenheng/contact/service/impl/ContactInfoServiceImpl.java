package com.yishenheng.contact.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yishenheng.common.entity.ContactInfo;
import com.yishenheng.contact.mapper.ContactInfoMapper;
import com.yishenheng.contact.service.ContactInfoService;
import org.springframework.stereotype.Service;

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

}
