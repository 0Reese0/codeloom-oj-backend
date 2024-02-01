package com.codeloom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeloom.domain.Role;
import com.codeloom.service.RoleService;
import com.codeloom.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【role】的数据库操作Service实现
* @createDate 2024-02-01 22:24:42
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




