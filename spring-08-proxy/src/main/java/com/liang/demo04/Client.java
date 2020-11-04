package com.liang.demo04;

import com.liang.demo03.UserService;
import com.liang.demo03.UserServiceImpl;

/**
 * 动态代理的好处：
 * 1可以使真实角色的操作更加纯粹，不用去关注一些公共业务
 * 2公共业务也可交给代理角色，实现了业务的分工
 * 3公共腋窝发生扩展的时候，方便集中管理
 * 4一个动态代理类代理的是一个接口，一般就i是对应的一类业务
 * 5一个动态代理类可以代理多个类，只要是实现了同一个接口
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService=new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandle pih=new ProxyInvocationHandle();
        pih.setTarget(userService);//设置要代理的角色
        //动态生成代理类
        UserService proxy= (UserService) pih.getProxy();
        proxy.add();

    }
}
