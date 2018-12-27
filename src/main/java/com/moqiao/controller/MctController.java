package com.moqiao.controller;

import com.moqiao.message.LoginMessage;
import com.moqiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mct")
public class MctController {
    @Autowired
    private UserService userService;

    private LoginMessage loginMessage;
}
