package com.liang.demo02;

/**
 * 静态代理
 * 优点：耦合性降低了
 * 缺点：代码量翻倍了
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImp userService=new UserServiceImp();
        //userService.add();

        //使用代理类，在不影响UserService业务的同时，添加自己的业务逻辑
        UserServiceProxy userServiceProxy=new UserServiceProxy();
        userServiceProxy.setUserServiceImp(userService);
        userServiceProxy.add();

    }
}
