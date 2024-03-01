package com.codeloom.exception;


import com.codeloom.model.enums.ResponseCodeEnum;

public class BizException extends RuntimeException {
    private Integer code;
    private String msg;

    public BizException(String msg) {
        super(msg);
        this.code = ResponseCodeEnum.FAIL.getCode();
        this.msg = msg;
    }

    public BizException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public BizException(ResponseCodeEnum responseCodeEnum) {
        super(responseCodeEnum.getMsg());
        this.code = responseCodeEnum.getCode();
        this.msg = responseCodeEnum.getMsg();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
