package com.liang.Log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 方法调用前，执行
 */
public class Log implements MethodBeforeAdvice {

    /**
     *
     * @param method 要执行对象的方法
     * @param args 参数
     * @param target 目标对象
     * @throws Throwable
     */
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+" 被执行了！");
    }

//    /**
//     *
//     * @param method 要执行对象的方法
//     * @param objects 参数
//     * @param o 目标对象
//     * @throws Throwable
//     */
//    public void before(Method method, Object[] objects, Object o) throws Throwable {
//
//    }
}
