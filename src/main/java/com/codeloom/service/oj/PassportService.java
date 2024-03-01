package com.codeloom.service.oj;

import com.codeloom.model.dto.LoginDTO;
import com.codeloom.model.response.Response;
import com.codeloom.model.vo.UserInfoVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface PassportService {

    Response<UserInfoVO> login(LoginDTO loginDTO, HttpServletResponse response, HttpServletRequest request);

}
