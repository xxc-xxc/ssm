package com.ssm.test;

import com.ssm.dao.UserDao;
import com.ssm.domain.User;
import com.ssm.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author xxc
 * @Date 2020/12/28 15:32
 * @Description TODO
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDaoTest {

    @Test
    public void testUserDao01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.findAll();
    }

    @Test
    public void testUserDao02() throws IOException {
        User user = new User();
        user.setUsername("xxx");

        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        userDao.save(user);
        session.commit();
        session.close();
        inputStream.close();
    }

    @Autowired
    private UserService userService;

    /**
     * Spring&Mybatis整合测试
     */
    @Test
    public void testSave() {
        User user = new User();
        user.setUsername("徐喜超");

        int save = userService.save(user);
        System.out.println(save);
    }

}
