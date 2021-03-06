package com.ssm.dao;

import com.ssm.domain.User;

import java.util.List;

/**
 * 用户持久层接口
 */
public interface UserDao {

    /**
     * 保存用户
     * @param user
     * @return 返回受影响的行数
     */
    int save(User user);

    /**
     * 查询所有用户
     * @return 返回所有的用户数据
     */
    List<User> findAll();

}
