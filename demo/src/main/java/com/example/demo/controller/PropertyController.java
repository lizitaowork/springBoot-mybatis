package com.example.demo.controller;

import com.example.demo.service.PropertyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zitao.li on 2018/7/17.
 */
@RestController
@RequestMapping("/property")
public class PropertyController {
    @Resource
    private PropertyService propertyService;

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String getInfo(){
        return propertyService.getInfo();
    }
    @RequestMapping(value = "/bean", method = RequestMethod.GET)
    public Object getProperty(){
        return propertyService.getPropertyUtils();
    }
    @RequestMapping(value = "/random/int1", method = RequestMethod.GET)
    public Object getRandomOfInt1(){
        return propertyService.getRandomInt1();
    }

    @RequestMapping(value = "/random/int2", method = RequestMethod.GET)
    public Object getRandomOfInt2(){
        return propertyService.getRandomInt2();
    }

    @RequestMapping(value = "/random/int3", method = RequestMethod.GET)
    public Object getRandomOfInt3(){
        return propertyService.getRandomInt3();
    }
    @RequestMapping(value = "/random/long", method = RequestMethod.GET)
    public Object getRandomOfLong(){
        return propertyService.getRandomLong();
    }
    @RequestMapping(value = "/random/string", method = RequestMethod.GET)
    public Object getRandomOfString(){
        return propertyService.getRandomString();
    }
    @RequestMapping(value = "/random/uuid", method = RequestMethod.GET)
    public Object getRandomOfUuid(){
        return propertyService.getRandomUuid();
    }
}
