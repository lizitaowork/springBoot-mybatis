package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zitao.li on 2018/7/18.
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("test")
    public String toTest(){
        return "index";
    }
}
