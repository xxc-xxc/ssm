package com.ssm.service.impl;

import com.ssm.dao.UserDao;
import com.ssm.domain.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xxc
 * @Date 2020/12/28 15:22
 * @Description TODO
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

//    @Autowired
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public int save(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> findAll() {
        userDao.findAll();
        return null;
    }
}
