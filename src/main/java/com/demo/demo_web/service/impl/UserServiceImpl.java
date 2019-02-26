package com.demo.demo_web.service.impl;

import com.demo.demo_web.dao.UserDao;
import com.demo.demo_web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
}
