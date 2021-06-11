package com.yishenheng.contact.controller;


import com.yishenheng.common.api.BaseController;
import com.yishenheng.common.api.ResultData;
import com.yishenheng.common.dto.ContactInfoDTO;
import com.yishenheng.contact.service.ContactInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 联系人详情 前端控制器
 * </p>
 *
 * @author yishenheng
 * @since 2021-06-10
 */
@RestController
@RequestMapping("/contactInfo")
@Api(value = "联系人相关接口",tags = "联系人相关接口")
public class ContactInfoController extends BaseController {

    private final ContactInfoService contactInfoService;

    @Autowired
    public ContactInfoController(ContactInfoService contactInfoService) {
        this.contactInfoService = contactInfoService;
    }

    @PostMapping("/")
    @ApiOperation(value = "保存联系人")
    public ResultData save(ContactInfoDTO saveParam){
        this.contactInfoService.saveContactInfo(saveParam);
        return ok();
    }

}

