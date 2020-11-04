package com.liang.poji;

public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

//    public User() {
//        System.out.println("User无参构造函数！");
//    }

    public User(String name){
        this.name=name;
    }

    public void show(){
        System.out.println("name:"+name);
    }
}
