package com.example;

import com.example.dao.DisscussPostMapper;
import com.example.dao.Usermapper;
import com.example.entity.DisscussPost;
import com.example.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;
import java.util.List;
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class Mappertest {
    @Resource
    private Usermapper usermapper;
    @Resource
    private  DisscussPostMapper disscussPostMapper;
    @Test
    public void testselectuser(){
        int rows=usermapper.updatePassword(10,"123456789");
        System.out.println(rows);
        int rows1=usermapper.updayeHeader(2,"https://www.nowcoder.com/study/live/246/1/30");
        System.out.println(rows1);
        int rows2=usermapper.updateStatus(1,0);
        System.out.println(rows2);
    }
    @Test
    public void testselect(){
            List<DisscussPost> list=disscussPostMapper.selectDisscussPosts(149 ,0,10);
             for(DisscussPost disscussPost:list){
                 System.out.println(disscussPost);
             }
             int rows=disscussPostMapper.selectDisscussPostsrows(149);
        System.out.println(rows);
    }
}
