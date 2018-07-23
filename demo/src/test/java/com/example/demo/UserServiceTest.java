package com.example.demo;

import com.example.demo.dao.bean.User;
import com.example.demo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zitao.li on 2018/7/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void selectAll(){
        List<User> userList = userService.selectAll();
        Assert.assertEquals(3, userList.size());
    }
}
