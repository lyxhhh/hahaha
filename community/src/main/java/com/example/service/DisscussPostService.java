package com.example.service;

import com.example.dao.DisscussPostMapper;
import com.example.entity.DisscussPost;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DisscussPostService {
    @Resource
    private DisscussPostMapper disscussPostMapper;
    public List<DisscussPost> selectDisscussPosts(int userId,int offset,int limit){
        return disscussPostMapper.selectDisscussPosts(userId, offset, limit);
    }
    public int selectDisscussPostsrows(int userId){
        return disscussPostMapper.selectDisscussPostsrows(userId);
    }
}
