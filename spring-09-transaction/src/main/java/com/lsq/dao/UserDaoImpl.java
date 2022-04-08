package com.lsq.dao;


import com.lsq.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author linshengqian
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserMapper {

    //增加一些操作
    @Override
    public List<User> selectUser() {
        User user = new User(7,"明","16");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(7);
        return mapper.selectUser();
    }

    //新增
    @Override
    public int addUser(User user) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.addUser(user);
    }
    //删除
    @Override
    public int deleteUser(int id) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }

}