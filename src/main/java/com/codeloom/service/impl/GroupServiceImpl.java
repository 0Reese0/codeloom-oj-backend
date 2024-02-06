package com.codeloom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeloom.model.domain.Group;
import com.codeloom.service.GroupService;
import com.codeloom.mapper.GroupMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【group】的数据库操作Service实现
* @createDate 2024-02-01 22:24:42
*/
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, Group>
    implements GroupService{

}




