package com.ssm.service;

import com.ssm.domain.User;

import java.util.List;

/**
 * @Author xxc
 * @Date 2020/12/28 15:06
 * @Description User业务层接口
 */
public interface UserService {

    /**
     * 保存用户
     * @param user
     * @return 返回受影响的行数
     */
    int save(User user);

    /**
     * 查找所有用户
     * @return 返回所有用户数据
     */
    List<User> findAll();

}
