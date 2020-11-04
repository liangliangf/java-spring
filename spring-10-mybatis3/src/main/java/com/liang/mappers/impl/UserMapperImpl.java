package com.liang.mappers.impl;

import com.liang.mappers.UserMapper;
import com.liang.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

// 继承SqlSessionDaoSupport，可以直接获取SqlSession
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    public List<User> queryList() {
        return getSqlSession().getMapper(UserMapper.class).queryList();
    }
}
