package com.example.service;

import com.example.dao.Usermapper;
import com.example.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private Usermapper usermapper;
    public User finduserById(int id){
        return usermapper.selectById(id);
    }
}
