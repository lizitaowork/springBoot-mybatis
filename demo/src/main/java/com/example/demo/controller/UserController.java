package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by zitao.li on 2018/7/17.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/select/all", method = RequestMethod.GET)
    @ResponseBody
    public Object selectAll(){
        return userService.selectAll();
    }

    @RequestMapping(value = "/select/id", method = RequestMethod.GET)
    @ResponseBody
    public Object selectByPrimaryKey(@RequestParam("id") Integer id){
        return userService.selectByPrimaryKey(id);
    }
}
