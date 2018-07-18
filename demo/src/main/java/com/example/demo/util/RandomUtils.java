package com.example.demo.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zitao.li on 2018/7/17.
 */
@Component
@ConfigurationProperties(prefix = "spring.test")
public class RandomUtils {
    private String mySecret;
    private int myInt1;
    private int myInt2;
    private int myInt3;
    private long myLong;
    private String myString;
    private String myUuid;

    public String getMySecret() {
        return mySecret;
    }

    public void setMySecret(String mySecret) {
        this.mySecret = mySecret;
    }

    public int getMyInt1() {
        return myInt1;
    }

    public void setMyInt1(int myInt1) {
        this.myInt1 = myInt1;
    }

    public int getMyInt2() {
        return myInt2;
    }

    public void setMyInt2(int myInt2) {
        this.myInt2 = myInt2;
    }

    public int getMyInt3() {
        return myInt3;
    }

    public void setMyInt3(int myInt3) {
        this.myInt3 = myInt3;
    }

    public long getMyLong() {
        return myLong;
    }

    public void setMyLong(long myLong) {
        this.myLong = myLong;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public String getMyUuid() {
        return myUuid;
    }

    public void setMyUuid(String myUuid) {
        this.myUuid = myUuid;
    }
}
