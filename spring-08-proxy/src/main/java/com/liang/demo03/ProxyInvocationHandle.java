package com.liang.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理，自动生成代理类
 */
public class ProxyInvocationHandle implements InvocationHandler {

    //被代理的接口
    private UserService userService;
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                this);
    }

    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(userService,args);
        addLog(method.getName());
        return "操作成功！";
    }

    public void addLog(String msg){
        System.out.println("【Log】调用了"+msg+"方法");
    }
}
