package com.codeloom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeloom.model.domain.UserInfo;
import com.codeloom.service.UserInfoService;
import com.codeloom.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【user_info】的数据库操作Service实现
* @createDate 2024-02-01 22:24:42
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

}




