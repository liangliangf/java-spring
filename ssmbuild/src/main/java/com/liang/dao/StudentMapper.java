package com.liang.dao;

import com.liang.pojo.T_student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
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
    int delById(@Param("studentId") int id);

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
    T_student querryById(@Param("studentId") int id);

    /**
     * 查询全部学生
     * @return
     */
    List<T_student> queryAll();
}
