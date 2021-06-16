package com.yishenheng.customer.controller;

import com.yishenheng.common.api.BaseController;
import com.yishenheng.common.api.ResultData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yishenheng
 * @date 6/14/21 8:57 PM
 */
@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController extends BaseController {

    @Value("${ysh.test}")
    private String msg;

    @GetMapping("/show")
    public ResultData showConfigMsg() {
        return ok(msg);
    }
}
