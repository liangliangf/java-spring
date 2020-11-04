package com.liang.mapper.Impl;

import com.liang.mapper.UserMapper;
import com.liang.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    private SqlSession sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> queryList() {
        UserMapper userMapper= sqlSession.getMapper(UserMapper.class);
        return userMapper.queryList();
    }
}
