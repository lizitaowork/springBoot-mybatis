package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.dao.bean.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zitao.li on 2018/7/6.
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> seleceAll(){
        return userMapper.selectAll();
    }

    public List<User> selectUserByNameList(){
        List<String> nameList = new ArrayList<String>();
        nameList.add("zhangsan");
        nameList.add("lisi");

        return userMapper.selectUserByNameList(nameList);
    }

    public List<User> selectUserByNameAndAge(){
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name", "zhangsan");
        params.put("age", 20);
        return userMapper.selectUserByNameAndAge(params);
    }

    public User selectByPrimaryKey(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

}
