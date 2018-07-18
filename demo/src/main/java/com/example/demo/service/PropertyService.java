package com.example.demo.service;

import com.example.demo.util.PropertyUtils;
import com.example.demo.util.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by zitao.li on 2018/7/17.
 */
@Service
public class PropertyService {
    @Value("${com.test.name}")
    private String name;
    @Value("${com.test.password}")
    private String password;
    @Autowired
    private PropertyUtils propertyUtils;
    @Autowired
    private RandomUtils randomUtils;

    public String getInfo(){
        return "name:" + name + ", password:"+password;
    }

    public PropertyUtils getPropertyUtils(){
        return propertyUtils;
    }

    public int getRandomInt1(){
        return randomUtils.getMyInt1();
    }

    public int getRandomInt2(){
        return randomUtils.getMyInt2();
    }

    public int getRandomInt3(){
        return randomUtils.getMyInt3();
    }

    public long getRandomLong(){
        return randomUtils.getMyLong();
    }

    public String getRandomString(){
        return randomUtils.getMyString();
    }

    public String getRandomUuid(){
        return randomUtils.getMyUuid();
    }
}
