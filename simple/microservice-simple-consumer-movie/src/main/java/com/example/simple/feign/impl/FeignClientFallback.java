package com.example.simple.feign.impl;

import com.example.simple.entity.User;
import com.example.simple.feign.UserFeignClient;
import org.springframework.stereotype.Component;

/**
 * 回退类FeignClientFallback需要实现Feign Client接口
 * FeignClientFallback也可以是public class，没有区别
 */
@Component
public class FeignClientFallback implements UserFeignClient {
    @Override
    public User findById(Long id) {
        return new User(-1L,"默认用户",null,0,null);
    }
}
