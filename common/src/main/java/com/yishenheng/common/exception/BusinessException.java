package com.yishenheng.common.exception;

import com.yishenheng.common.api.ResultCode;

/**
 * @author yishenheng
 * @date 2020-05-25 12:43
 */
public class BusinessException extends RuntimeException {

    private int code = -1;

    public BusinessException(String msg) {
        super(msg);
    }


    public BusinessException(ResultCode resultCode) {
        this(resultCode.getCode(), resultCode.getMessage());
    }

    public BusinessException(int code, String msg) {
        super(msg);
        this.code = code;
    }


    public int getCode() {
        return code;
    }
}
