package com.shop.controller.user;

import com.shop.req.user.LoginReq;
import com.shop.rsp.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author:YangZP
 * @Description:
 * @Date:Created in 10:302018/3/30
 **/
@RestController
public interface UserController {
    /**
     * 登录
     * @param loginReq 登录请求参数
     * @param httpRsp HTTP响应
     * @return 登录是否成功
     */
    @GetMapping("/login")
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp);
}