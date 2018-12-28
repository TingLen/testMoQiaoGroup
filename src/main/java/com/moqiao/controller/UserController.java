package com.moqiao.controller;

import com.moqiao.message.GetUrlMessage;
import com.moqiao.message.LoginMessage;
import com.moqiao.pojo.WorkUser;
import com.moqiao.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @ApiOperation(value = "用户登录")
    @ApiImplicitParam(name = "workUser", value = "用户登录前端传来的form workUser",dataType = "WorkUser",required = true)
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginMessage login(@RequestBody WorkUser workUser ){
        LoginMessage loginMessage = new LoginMessage();

        //前端传入的密码md5加密

        //调用service
        int i  = userService.login(workUser.getUsercode(),DigestUtils.md5DigestAsHex(workUser.getUserpassword().getBytes()));
        if(i != 0){
            loginMessage.setSuccess(true);
            loginMessage.setMessage("登陆成功");
            return loginMessage;
        }

        loginMessage.setSuccess(false);
        loginMessage.setMessage("账号或密码错误");
        return loginMessage;
    }

    @ApiOperation(value = "查找账号归属项目")
    @ApiImplicitParam(name = "usercode", value = "通过用户名查找用户归属项目url,提供给前端做router拼接", dataType = "string",required = true)
    @GetMapping("/getUrl")
    public GetUrlMessage getUrl(String usercode){
        GetUrlMessage getUrlMessage = new GetUrlMessage();
        //调用service
        try {
            String url = userService.getUrl(usercode);
            getUrlMessage.setSuccess(true);
            getUrlMessage.setUrl(url);
            return getUrlMessage;
        } catch (Exception e) {
            e.printStackTrace();
            getUrlMessage.setSuccess(false);
            getUrlMessage.setUrl(null);
            return getUrlMessage;
        }

    }


}
