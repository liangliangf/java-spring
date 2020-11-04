package com.liang.Log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;


public class AfterLog implements AfterReturningAdvice {

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"后，返回结果为："+returnValue);
    }
}
