package com.example.demo.service;

import com.example.demo.util.TestPropertyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zitao.li on 2018/7/18.
 */
@Service
public class TestPropertyService {
    @Autowired
    private TestPropertyUtils testPropertyUtils;

    public String getInfo(){
        return "name : " + testPropertyUtils.getName() + ", password : " + testPropertyUtils.getPassword();
    }
}
