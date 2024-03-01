package com.codeloom.model.response;


import com.codeloom.model.enums.ResponseCodeEnum;
import lombok.Data;

@Data
public class Response<T> {
    private Integer code;

    private T data;

    private String msg;

    Response(Integer code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    /**
     * 成功
     */
    public static <T> Response<T> success(T data,String msg) {
        return new Response<>(ResponseCodeEnum.SUCCESS.getCode(), data, msg);
    }

    public static <T> Response<T> success(T data) {
        return new Response<>(ResponseCodeEnum.SUCCESS.getCode(), data, ResponseCodeEnum.SUCCESS.getMsg());
    }

    public static <T> Response<T> success(String msg) {
        return new Response<>(ResponseCodeEnum.SUCCESS.getCode(), null, msg);
    }

    public static <T> Response<T> success() {
        return new Response<>(ResponseCodeEnum.SUCCESS.getCode(), null, ResponseCodeEnum.SUCCESS.getMsg());
    }


    /**
     * 失败
     */
    public static <T> Response<T> fail( String msg) {
        return new Response<>(ResponseCodeEnum.FAIL.getCode(), null, msg);
    }


    public static <T> Response<T> fail(ResponseCodeEnum errorCode) {
        return new Response<>(errorCode.getCode(), null, errorCode.getMsg());
    }

    public static <T> Response<T> fail(ResponseCodeEnum errorCode, String msg) {
        return new Response<>(errorCode.getCode(), null, msg);
    }

    public static <T> Response<T> fail(Integer code, String msg) {
        return new Response<>(code, null, msg);
    }




}
