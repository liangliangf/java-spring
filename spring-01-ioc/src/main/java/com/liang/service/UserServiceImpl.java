package com.liang.service;

import com.liang.dao.UserDao;
import com.liang.dao.UserDaoImpl;
import com.liang.dao.UserMSSqlDaoIImpl;
import com.liang.dao.UserMysqlDaoImpl;

public class UserServiceImpl implements UserService {

    //private UserDao userDao= new UserDaoImpl();
    //private UserDao userDao= new UserMysqlDaoImpl();
    //private UserDao userDao= new UserMSSqlDaoIImpl();

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }

}
