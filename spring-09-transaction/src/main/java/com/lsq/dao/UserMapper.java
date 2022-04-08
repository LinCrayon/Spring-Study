package com.lsq.dao;

import com.lsq.pojo.User;

import java.util.List;

/**
 * @author linshengqian
 */
public interface UserMapper {
    //查询全部用户
    List<User> selectUser();

    //添加一个用户
    int addUser(User user);

    //根据id删除用户
    int deleteUser(int id);


}
