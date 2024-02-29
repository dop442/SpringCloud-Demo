package com.zc.learn.shop.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.zc.learn.shop.bean.User;
import com.zc.learn.shop.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/get/{uid}")
    public User getUser(@PathVariable("uid") Long uid){
        User user = userService.getUserById(uid);
        log.info("收到的用户信息为：{}", JSONObject.toJSONString(user));
        return user;
    }

}
