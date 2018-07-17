package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zitao.li on 2018/7/16.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    @ResponseBody
    public Object selectAll(){
        return userService.seleceAll();
    }

    @RequestMapping(value = "/select/list", method = RequestMethod.GET)
    @ResponseBody
    public Object selectByList(){
        return userService.selectUserByNameList();
    }

    @RequestMapping(value = "/select/map", method = RequestMethod.GET)
    @ResponseBody
    public Object selectByMap(){
        return userService.selectUserByNameAndAge();
    }

    @RequestMapping(value = "/select/key", method = RequestMethod.GET)
    @ResponseBody
    public Object selectByMap(@RequestParam("id") Integer id){
        return userService.selectByPrimaryKey(id);
    }
}
