package com.hystrix.mapper;

import com.hystrix.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    Integer save(User user);
}
