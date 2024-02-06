package com.codeloom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeloom.model.domain.Contest;
import com.codeloom.service.ContestService;
import com.codeloom.mapper.ContestMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【contest】的数据库操作Service实现
* @createDate 2024-02-01 22:24:42
*/
@Service
public class ContestServiceImpl extends ServiceImpl<ContestMapper, Contest>
    implements ContestService{

}




