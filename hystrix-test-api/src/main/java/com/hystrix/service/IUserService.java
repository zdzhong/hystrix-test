package com.hystrix.service;

import com.hystrix.bean.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public interface IUserService {

    @RequestMapping("/user/saveUser")
    Integer saveUser(@RequestBody User user);
}
