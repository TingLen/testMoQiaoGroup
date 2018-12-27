package com.moqiao.controller;

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

    private LoginMessage loginMessage;


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


}
