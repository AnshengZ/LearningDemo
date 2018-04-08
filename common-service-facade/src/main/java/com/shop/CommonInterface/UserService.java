package com.shop.CommonInterface;

import com.shop.Entithy.UserEntity;
import com.shop.req.user.LoginReq;

/**
 * @Author:YangZP
 * @Description:
 * @Date:Created in 15:432018/3/28
 **/
public interface UserService {
    public UserEntity login(LoginReq loginReq);
}