package com.liang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 注解
 */

@Aspect //标注这个类是一个切面
//@Component 如果不在xml配置文件中配置bean，也可以直接用注入方式
public class AnnotationPointCut {

    @Before("execution(* com.liang.service.UserServiceImpl.*(..))")
    public void befour(){
        System.out.println("执行之前");
    }

    @After("execution(* com.liang.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("执行之后");
    }

    @Around("execution(* com.liang.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        joinPoint.proceed();//执行方法
        System.out.println("环绕后");
    }

}
