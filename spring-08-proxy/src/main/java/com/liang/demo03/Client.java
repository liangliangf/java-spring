package com.liang.demo03;

/**
 *
 */
public class Client {

    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();
        ProxyInvocationHandle pih=new ProxyInvocationHandle();
        pih.setUserService(userService);

        UserService userService1=(UserService) pih.getProxy();
        userService1.add();
    }
}
