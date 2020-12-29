package com.ssm.controller;

import com.ssm.domain.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("saveUser")
    public String saveUser(User user) {
        userService.save(user);
        return "redirect:findAllUser";
    }

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("findAllUser")
    public ModelAndView findAllUser() {
//        System.out.println("成功查询所有用户");
        List<User> userList = userService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("userList", userList);
        mv.setViewName("userList");
        return mv;
    }
}
