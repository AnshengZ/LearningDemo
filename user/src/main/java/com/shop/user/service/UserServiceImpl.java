package com.shop.user.service;

import com.shop.CommonInterface.UserService;
import com.shop.Entithy.UserEntity;
import com.shop.req.user.LoginReq;
import com.alibaba.dubbo.config.annotation.Service;
import com.shop.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @Author:YangZP
 * @Description:
 * @Date:Created in 16:022018/3/28
 **/
@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public UserEntity login(LoginReq loginReq){
        UserEntity user = userMapper.findUserByPhone(loginReq.getPhone());
        return user;
    }
}
