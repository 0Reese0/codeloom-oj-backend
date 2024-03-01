package com.codeloom;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;

@PropertySource(value = "classpath:application.yml")
@SpringBootTest(classes = CodeloomOjBackedApplication.class)
@ContextConfiguration
class CodeloomOjBackedApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    public UserInfoService userInfoService;

    @Test
    void register(){
        UserRegisterRequest userRegisterRequest=new UserRegisterRequest();
        userRegisterRequest.setUserUsername("test");
        userRegisterRequest.setUserPassword("123456");
        userRegisterRequest.setCheckPassword("123456");
        Boolean result=userInfoService.userRegister(userRegisterRequest);
        System.out.println(result);
    }

}
