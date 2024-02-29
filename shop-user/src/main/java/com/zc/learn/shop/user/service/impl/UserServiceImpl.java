package com.zc.learn.shop.user.service.impl;

import com.zc.learn.shop.bean.User;
import com.zc.learn.shop.user.mapper.UserMapper;
import com.zc.learn.shop.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(long userId) {
        return userMapper.selectById(userId);
    }
}
