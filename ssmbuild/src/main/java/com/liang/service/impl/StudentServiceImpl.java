package com.liang.service.impl;

import com.liang.dao.StudentMapper;
import com.liang.pojo.T_student;
import com.liang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public int addStudent(T_student student) {
        return studentMapper.addStudent(student);
    }

    public int delById(int id) {
        return studentMapper.delById(id);
    }

    public int updateStudent(T_student student) {
        return studentMapper.updateStudent(student);
    }

    public T_student querryById(int id) {
        return studentMapper.querryById(id);
    }

    public List<T_student> queryAll() {
        return studentMapper.queryAll();
    }


}
