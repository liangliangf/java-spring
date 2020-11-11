package com.liang.controller;

import com.liang.pojo.T_student;
import com.liang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student/allList")
    public String getList(){

        List<T_student> list= studentService.queryAll();
        for (T_student student : list){
            System.out.println(student.toString());
        }

        return "studentList";
    }

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","Hello SpringMVC By Annotation");
        return "test";
    }

}
