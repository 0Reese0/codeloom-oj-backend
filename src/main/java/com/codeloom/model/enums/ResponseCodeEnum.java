package com.codeloom.model.enums;

public enum ResponseCodeEnum {
    SUCCESS(0, "操作成功"), ERROR(5000, "操作失败"),

    FILE_UPLOAD_FAILED(5001, "文件上传失败"),
    FILE_DOWNLOAD_FAILED(5002, "文件下载失败"),
    PARAMS_VALIDATE_FAILED(5003, "参数校验失败");

    private Integer code;

    private String msg;

    ResponseCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
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
