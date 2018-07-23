package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Created by zitao.li on 2018/7/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class IndexControllerTest {
    //mock api用来模拟http请求
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/test")
                .accept(MediaType.APPLICATION_JSON)) //接收的报文格式
                .andExpect(MockMvcResultMatchers.status().isOk()) //检查Http状态是否正确
                .andExpect(MockMvcResultMatchers.content().string("test")); //测试接口返回内容
    }
}
