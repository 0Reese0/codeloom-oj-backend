package com.codeloom.model.response;


import com.codeloom.model.enums.ResponseCodeEnum;

public class Response<T> {
    private Integer code;

    private T data;

    private String msg;

    Response(Integer code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }


    public static <T> Response<T> fail(ResponseCodeEnum errorCode) {
        return new Response<>(errorCode.getCode(), null, errorCode.getMsg());
    }

    public static <T> Response<T> fail(Integer code, String msg) {
        return new Response<>(code, null, msg);
    }

    public static <T> Response<T> success(T data) {
        return new Response<>(ResponseCodeEnum.SUCCESS.getCode(), data, ResponseCodeEnum.SUCCESS.getMsg());
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
