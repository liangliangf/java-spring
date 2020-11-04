package com.liang.service;

import com.liang.dao.UserDao;

public interface UserService {
    void getUser();
    void setUserDao(UserDao userDao);
}
