package com.example.demo.dao;

import com.example.demo.dao.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by zitao.li on 2018/7/6.
 */
@Service
public interface UserMapper {
    List<User> selectAll();

    List<User> selectUserByNameAndAge(Map<String, Object> map);

    List<User> selectUserByNameList(List<String> nameList);

    @Select("select * from user where id = #{id, jdbcType=INTEGER}")
    User selectByPrimaryKey(Integer id);
}
