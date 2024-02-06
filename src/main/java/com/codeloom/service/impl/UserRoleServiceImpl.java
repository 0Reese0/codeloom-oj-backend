package com.codeloom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeloom.model.domain.UserRole;
import com.codeloom.service.UserRoleService;
import com.codeloom.mapper.UserRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【user_role】的数据库操作Service实现
* @createDate 2024-02-01 22:24:42
*/
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole>
    implements UserRoleService{

}




