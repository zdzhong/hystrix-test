package com.hystrix.service;

import com.hystrix.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(name = "", fallback = UserRemoteService.HystrixUserServiceFallback.class)
public interface UserRemoteService extends IUserService {

    @Component
    public static class HystrixUserServiceFallback implements UserRemoteService{

        @Override
        public Integer saveUser(User user) {
            return null;
        }
    }

}
