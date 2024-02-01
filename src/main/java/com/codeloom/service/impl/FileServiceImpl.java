package com.codeloom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeloom.domain.File;
import com.codeloom.service.FileService;
import com.codeloom.mapper.FileMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【file】的数据库操作Service实现
* @createDate 2024-02-01 22:24:42
*/
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File>
    implements FileService{

}




