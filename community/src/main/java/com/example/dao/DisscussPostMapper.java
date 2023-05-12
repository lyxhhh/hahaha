package com.example.dao;

import com.example.entity.DisscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DisscussPostMapper {
    List<DisscussPost> selectDisscussPosts(int userId,int offset,int limit);
//    @parea用于给参数起别名
//    如果条件只有一个参数，而且在<if>中使用，必须起别名
    int selectDisscussPostsrows(@Param("userId") int userId);
}
