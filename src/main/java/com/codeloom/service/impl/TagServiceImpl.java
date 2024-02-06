package com.codeloom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeloom.model.domain.Tag;
import com.codeloom.service.TagService;
import com.codeloom.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【tag】的数据库操作Service实现
* @createDate 2024-02-01 22:24:42
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




