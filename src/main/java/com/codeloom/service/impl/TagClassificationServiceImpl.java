package com.codeloom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeloom.model.domain.TagClassification;
import com.codeloom.service.TagClassificationService;
import com.codeloom.mapper.TagClassificationMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【tag_classification】的数据库操作Service实现
* @createDate 2024-02-01 22:24:42
*/
@Service
public class TagClassificationServiceImpl extends ServiceImpl<TagClassificationMapper, TagClassification>
    implements TagClassificationService{

}




