package com.codeloom.exception;


import com.codeloom.model.enums.ResponseCodeEnum;
import com.codeloom.model.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyGlobalException {

    private static final Logger log = LoggerFactory.getLogger(MyGlobalException.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Response handleException(Exception e) {
        e.printStackTrace();
        log.error(e.getMessage(), e);
        return Response.fail(ResponseCodeEnum.ERROR.getCode(), e.getMessage());
    }

    @ExceptionHandler(value = BizException.class)
    public Response handleBizException(BizException e) {
        e.printStackTrace();
        log.error(e.getMessage(), e);
        return Response.fail(e.getCode(), e.getMsg());
    }

}
