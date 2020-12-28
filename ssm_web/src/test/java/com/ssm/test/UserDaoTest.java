package com.ssm.test;

import com.ssm.dao.UserDao;
import com.ssm.domain.User;
import com.ssm.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author xxc
 * @Date 2020/12/28 15:32
 * @Description TODO
 */
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

}
