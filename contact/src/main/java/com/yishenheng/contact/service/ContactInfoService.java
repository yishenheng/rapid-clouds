package com.yishenheng.contact.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yishenheng.common.dto.ContactInfoDTO;
import com.yishenheng.common.entity.ContactInfo;

/**
 * <p>
 * 联系人详情 服务类
 * </p>
 *
 * @author yishenheng
 * @since 2021-06-10
 */
public interface ContactInfoService extends IService<ContactInfo> {

    /**
     * 保存联系人信息
     * @param saveParam customerId 一定要存在客户表中
     */
    void saveContactInfo(ContactInfoDTO saveParam);
}
