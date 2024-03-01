package com.codeloom.controller.oj;

import com.codeloom.model.domain.user.UserInfo;
import com.codeloom.model.dto.LoginDTO;
import com.codeloom.model.dto.RegisterDTO;
import com.codeloom.model.response.Response;
import com.codeloom.model.vo.UserInfoVO;
import com.codeloom.service.oj.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api")
public class PassportController {

    @Autowired
    private PassportService passportService;

    @PostMapping("/login")
    public Response<UserInfoVO> login(@Validated @RequestBody LoginDTO loginDTO, HttpServletResponse response, HttpServletRequest request){
        return passportService.login(loginDTO, response, request);
    }

}
