package com.hystrix.service;

import com.hystrix.bean.User;
import com.hystrix.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public Integer save(User user) {
        return userMapper.save(user);
    }
}
