package com.demo.demo_web.dao;

import com.demo.demo_web.entity.User;

public interface UserDao {
    Integer addUser(User user);
    User queryUserByUserName(String username);
}
