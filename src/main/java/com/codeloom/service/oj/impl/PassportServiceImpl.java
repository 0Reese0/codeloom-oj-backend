package com.codeloom.service.oj.impl;

import com.codeloom.exception.StatusFailException;
import com.codeloom.manager.PassportManager;
import com.codeloom.model.dto.LoginDTO;
import com.codeloom.model.response.Response;
import com.codeloom.model.vo.UserInfoVO;
import com.codeloom.service.oj.PassportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class PassportServiceImpl implements PassportService {


    @Resource
    private PassportManager passportManager;


    @Override
    public Response<UserInfoVO> login(LoginDTO loginDTO, HttpServletResponse response, HttpServletRequest request) {
        try{
            return Response.success(passportManager.login(loginDTO, response, request));
        }catch (StatusFailException e){
            return Response.fail(e.getMessage());
        }
    }
}
