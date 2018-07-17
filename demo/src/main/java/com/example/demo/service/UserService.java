package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.dao.bean.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zitao.li on 2018/7/17.
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> selectAll(){
        return userMapper.selectAll();
    }

    public User selectByPrimaryKey(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }
}
