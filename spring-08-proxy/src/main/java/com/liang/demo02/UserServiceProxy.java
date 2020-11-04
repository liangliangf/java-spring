package com.liang.demo02;

/**
 * 在不影响 UserService 业务的情况下，添加自己的业务
 */
public class UserServiceProxy implements UserService {

    private UserServiceImp userServiceImp;
    public void setUserServiceImp(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    public void add() {
        addLog("add");
        userServiceImp.add();
    }

    public void delete() {
        addLog("delete");
        userServiceImp.delete();
    }

    public void update() {
        addLog("update");
        userServiceImp.update();
    }

    public void query() {
        addLog("query");
        userServiceImp.query();
    }

    public void addLog(String msg){
        System.out.println("【Log】调用了"+msg+"方法");
    }
}
