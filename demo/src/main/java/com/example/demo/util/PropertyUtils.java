package com.example.demo.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 配置文件中以com.test开头的配置对应的实体类
 * Created by zitao.li on 2018/7/17.
 */
@Component
@ConfigurationProperties(prefix = "com.test")
public class PropertyUtils {
    private String name;
    private String password;
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
