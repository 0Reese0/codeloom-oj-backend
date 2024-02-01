package com.codeloom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeloom.domain.GroupMember;
import com.codeloom.service.GroupMemberService;
import com.codeloom.mapper.GroupMemberMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【group_member】的数据库操作Service实现
* @createDate 2024-02-01 22:24:42
*/
@Service
public class GroupMemberServiceImpl extends ServiceImpl<GroupMemberMapper, GroupMember>
    implements GroupMemberService{

}




