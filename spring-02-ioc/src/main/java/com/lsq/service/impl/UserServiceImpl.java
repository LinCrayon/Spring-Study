package com.lsq.service.impl;

import com.lsq.dao.UserDao;
import com.lsq.service.UserService;

public class UserServiceImpl implements UserService {
    //private UserDao userDao = new UserDaoImpl();
    //private UserDao userDao = new UserDaoMySqlImpl();


    private UserDao userDao;
    // 利用set实现
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
