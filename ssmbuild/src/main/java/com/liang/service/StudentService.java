package com.liang.service;

import com.liang.pojo.T_student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {
    /**
     * 添加学生
     * @param student
     * @return
     */
    int addStudent(T_student student);

    /**
     * 删除学生
     * @param id
     * @return
     */
    int delById(int id);

    /**
     * 修改学生
     * @param student
     * @return
     */
    int updateStudent(T_student student);

    /**
     * 查询学生
     * @param id
     * @return
     */
    T_student querryById(int id);

    /**
     * 查询全部学生
     * @return
     */
    List<T_student> queryAll();
}
