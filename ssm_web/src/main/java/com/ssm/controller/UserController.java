package com.ssm.controller;

import com.ssm.domain.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author xxc
 * @Date 2020/12/28 16:36
 * @Description TODO
 */
@Controller("userController")
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("findAllUser")
    public String findAllUser() {
        System.out.println("查询了所有的用户");
        return "success";
    }
}
