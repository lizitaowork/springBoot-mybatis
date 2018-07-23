package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zitao.li on 2018/7/18.
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String toTest(){
        return "test";
    }
}
