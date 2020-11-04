package com.liang.poji;

public class UserT {
    public UserT() {
        System.out.println("UserT无参构造函数！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void show(){
        System.out.println("name:"+name);
    }

}
