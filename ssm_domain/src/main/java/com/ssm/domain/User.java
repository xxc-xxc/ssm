package com.ssm.domain;

import java.beans.Transient;
import java.io.Serializable;

/**
 * @Author xxc
 * @Date 2020/12/28 14:43
 * @Description 用户实体类
 */
public class User implements Serializable {
    
    private static final long serialVersionUID = -4478075092323206374L;
    private Integer id;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
