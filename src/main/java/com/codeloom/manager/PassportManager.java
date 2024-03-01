package com.codeloom.manager;

import cn.hutool.log.Log;
import com.codeloom.exception.StatusFailException;
import com.codeloom.model.dto.LoginDTO;
import com.codeloom.model.vo.UserInfoVO;
import com.codeloom.utils.Constants;
import com.codeloom.utils.IpUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@Component
@Slf4j
public class PassportManager {


    public UserInfoVO login(LoginDTO loginDTO, HttpServletResponse response, HttpServletRequest request) throws StatusFailException {

        loginDTO.setPassword(loginDTO.getPassword().trim());
        loginDTO.setUsername(loginDTO.getUsername().trim());

        if(StringUtils.isEmpty(loginDTO.getUsername()) || StringUtils.isEmpty(loginDTO.getPassword())){
            throw new StatusFailException("用户名或密码不能为空");
        }

        if (loginDTO.getPassword().length() < 6 || loginDTO.getPassword().length() > 20) {
            throw new StatusFailException("密码长度应该为6~20位！");
        }

        if (loginDTO.getUsername().length() > 20) {
            throw new StatusFailException("用户名长度不能超过20位!");
        }


        String userIpAddr = IpUtils.getUserIpAddr(request);
        String key = Constants.Account.TRY_LOGIN_NUM.getCode() + loginDTO.getUsername() + "_" + userIpAddr;

        log.info("userIpAddr:"+userIpAddr);
        log.info("key:"+key);






        return null;

    }

}
