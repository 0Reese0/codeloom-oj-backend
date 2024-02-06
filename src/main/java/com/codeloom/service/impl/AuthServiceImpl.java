package com.codeloom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeloom.model.domain.Auth;
import com.codeloom.service.AuthService;
import com.codeloom.mapper.AuthMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【auth】的数据库操作Service实现
* @createDate 2024-02-01 22:24:41
*/
@Service
public class AuthServiceImpl extends ServiceImpl<AuthMapper, Auth>
    implements AuthService{

}




