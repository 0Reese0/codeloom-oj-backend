package com.codeloom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeloom.domain.Comment;
import com.codeloom.service.CommentService;
import com.codeloom.mapper.CommentMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【comment】的数据库操作Service实现
* @createDate 2024-02-01 22:24:41
*/
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
    implements CommentService{

}




