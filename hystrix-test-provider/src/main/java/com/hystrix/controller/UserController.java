package com.hystrix.controller;

import com.hystrix.bean.User;
import com.hystrix.service.IUserService;
import com.hystrix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements IUserService {

    @Autowired
    private UserService userService;

    @Override
    public Integer saveUser(@RequestBody User user) {
        return userService.save(user);
    }
}
