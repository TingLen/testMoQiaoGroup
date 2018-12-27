package com.moqiao;

import com.moqiao.controller.UserController;
import com.moqiao.pojo.WorkUser;
import com.moqiao.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.nio.charset.Charset;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    private MockMvc mockMvc;

    @Autowired
    private UserController userController;

    @Before
    public void setMockMvc(){
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    @Test
    public void loginSuccessTest() throws Exception {

        String json = "{ \"titlecode\": \"string\", \"usercode\": \"lmh111\", \"userpassword\": \"lmh111\"}";
        RequestBuilder request = null;
        request = post("/user/login")
                .contentType("application/json")
                .content(json);

        mockMvc.perform(request)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("{\"success\":true,\"message\":\"登陆成功\"}"));
    }
}
