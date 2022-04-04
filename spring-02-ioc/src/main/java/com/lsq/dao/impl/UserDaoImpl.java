package com.lsq.dao.impl;

import com.lsq.dao.UserDao;

/**
 * @author linshengqian
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取用户数据");
    }
}
