package com.codeloom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeloom.domain.UserRecord;
import com.codeloom.service.UserRecordService;
import com.codeloom.mapper.UserRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【user_record】的数据库操作Service实现
* @createDate 2024-02-01 22:24:42
*/
@Service
public class UserRecordServiceImpl extends ServiceImpl<UserRecordMapper, UserRecord>
    implements UserRecordService{

}




