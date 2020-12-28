package com.ssm.test;

import com.ssm.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author xxc
 * @Date 2020/12/28 15:32
 * @Description TODO
 */
public class UserDaoTest {

    @Test
    public void testUserDao() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.findAll();
    }

}
