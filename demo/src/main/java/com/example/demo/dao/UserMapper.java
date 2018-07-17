package com.example.demo.dao;

import com.example.demo.dao.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zitao.li on 2018/7/17.
 */
@Service
public interface UserMapper {

    @Select("select * from user")
    List<User> selectAll();

    User selectByPrimaryKey(Integer id);
}
