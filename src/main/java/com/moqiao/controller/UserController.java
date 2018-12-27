package com.moqiao.controller;

import com.moqiao.message.LoginMessage;
import com.moqiao.pojo.WorkUser;
import com.moqiao.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
//        LoginMessage loginMessage = new LoginMessage();
//
//        WorkUser resWorkUser = userService.login(workUser.getUsercode(),workUser.getUserpassword());
//
//        //若返回对象不为null,则说明数据库有该账号数据
//        if(resWorkUser != null){
//            try {
//                //前端传入的密码md5加密
//                byte[] bytesOfPassword = workUser.getUserpassword().getBytes("UTF-8");
//                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
//                byte[] passwordMd5 = messageDigest.digest(bytesOfPassword);
//
//                //与后端返回值对比
//
//                new String(passwordMd5,"UTF-8");
//
//                if(resWorkUser.getUserpassword().equals(new String(passwordMd5,"UTF-8"))){
//                    loginMessage.setSuccess(true);
//                    loginMessage.setMessage("登陆成功");
//                    return loginMessage;
//                }
//                loginMessage.setSuccess(false);
//                loginMessage.setMessage("密码错误");
//                return loginMessage;
//
//
//            } catch (NoSuchAlgorithmException e) {
//                e.printStackTrace();
//            } catch (UnsupportedEncodingException e) {
//                e.printStackTrace();
//            }
//        }
//        loginMessage.setMessage("账号错误");
//        loginMessage.setSuccess(false);
//        return loginMessage;
        /**
         * 1.将前端密码进行md5加密
         * 2.调用service.login
         * 3.判断用户是否存在
         */


        //前端传入的密码md5加密
        try {
            MessageDigest messageDigest = null;
            messageDigest = MessageDigest.getInstance("MD5");
            byte[] passwordMd5 = messageDigest.digest(workUser.getUserpassword().getBytes("UTF-8"));

            //调用service
            WorkUser resWorkUser = userService.login(workUser.getUsercode(),new String(passwordMd5));

            //若返回的resWorkUser不为null，则表示账号密码正确在数据库中找到用户
            if(resWorkUser != null){

                loginMessage.setSuccess(true);
                loginMessage.setMessage("登陆成功");
                return loginMessage;
            }
                loginMessage.setSuccess(false);
                loginMessage.setMessage("账号或密码错误");
                return loginMessage;


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        loginMessage.setSuccess(false);
        loginMessage.setMessage("网络错误");
        return loginMessage;






    }
}
