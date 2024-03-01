package com.codeloom.model.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;


@Getter
public enum ResponseCodeEnum {
    SUCCESS(200,"成功"),
    FAIL(400,"失败"),
    ACCESS_DENIED(401,"访问受限"),
    FORBIDDEN(403,"拒绝访问"),
    NOT_FOUND(404,"数据不存在"),
    SYSTEM_ERROR(500,"系统错误");

    private Integer code;

    private String msg;

    ResponseCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
