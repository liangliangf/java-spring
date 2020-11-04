package com.liang.mapper;

import com.liang.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> queryList();

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
