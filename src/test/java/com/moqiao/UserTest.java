package com.moqiao;

import com.moqiao.MCT.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

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


    @Test
    public void getUrlFalid() throws Exception {
        RequestBuilder request = null;
        request = get("/user/getUrl")
                .param("usercode","ssssssssss");
        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("{\"success\":false,\"url\":null}"));
    }

    @Test
    public void getUrlSuccess() throws Exception {
        RequestBuilder request = null;
        request = get("/user/getUrl")
                .param("usercode","admin");
        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("{\"success\":true,\"url\":\":8888\"}"));
    }
}
