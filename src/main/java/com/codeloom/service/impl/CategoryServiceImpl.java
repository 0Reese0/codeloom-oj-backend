package com.codeloom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeloom.domain.Category;
import com.codeloom.service.CategoryService;
import com.codeloom.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【category】的数据库操作Service实现
* @createDate 2024-02-01 22:24:41
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




