package com.shop.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shop.CommonInterface.UserService;
import com.shop.Entithy.UserEntity;
import com.shop.req.user.LoginReq;
import com.shop.rsp.Result;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author:YangZP
 * @Description:
 * @Date:Created in 16:172018/3/28
 **/
@RestController
public class UserControllerImpl implements UserController{
    @Reference(version = "1.0.0")
    private UserService userService;


    public Result login(LoginReq loginReq, HttpServletResponse httpRsp) {

        // 登录鉴权
        UserEntity userEntity = userService.login(loginReq);
        return Result.newSuccessResult(userEntity);
    }

}
