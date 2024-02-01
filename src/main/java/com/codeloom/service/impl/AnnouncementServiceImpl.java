package com.codeloom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codeloom.domain.Announcement;
import com.codeloom.service.AnnouncementService;
import com.codeloom.mapper.AnnouncementMapper;
import org.springframework.stereotype.Service;

/**
* @author ASUS
* @description 针对表【announcement】的数据库操作Service实现
* @createDate 2024-02-01 22:24:41
*/
@Service
public class AnnouncementServiceImpl extends ServiceImpl<AnnouncementMapper, Announcement>
    implements AnnouncementService{

}




