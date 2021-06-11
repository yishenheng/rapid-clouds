package com.yishenheng.customer.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yishenheng.common.api.BaseController;
import com.yishenheng.common.api.ResultData;
import com.yishenheng.common.dto.CustomerInfoDTO;
import com.yishenheng.common.entity.CustomerInfo;
import com.yishenheng.customer.service.CustomerInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 客户详情表 前端控制器
 * </p>
 *
 * @author yishenheng
 * @since 2021-06-10
 */
@RestController
@RequestMapping("/customerInfo")
@Api(value = "客户信息相关接口",tags = "客户信息相关接口")
public class CustomerInfoController extends BaseController{

    private final CustomerInfoService customerInfoService;

    @Autowired
    public CustomerInfoController(CustomerInfoService customerInfoService) {
        this.customerInfoService = customerInfoService;
    }

    @PostMapping("/")
    @ApiOperation(value="保存客户信息")
    public ResultData save(CustomerInfoDTO saveParam) {
        this.customerInfoService.save(saveParam);
        return ok();
    }

    @GetMapping("/{current}/{size}")
    @ApiOperation(value = "分页查询客户信息")
    public ResultData queryPage(@PathVariable @ApiParam(name = "current",value = "当前页") Integer current, @PathVariable @ApiParam(name = "size",value = "每页显示的条数") Integer size){
        return ok(this.customerInfoService.lambdaQuery().page(new Page<>(current,size)));
    }

    @GetMapping("/queryCustomerIds")
    @ApiOperation(value = "查询所有的客户Id")
    public ResultData queryCustomerIds(){
        return ok(this.customerInfoService.queryIds());
    }
}

