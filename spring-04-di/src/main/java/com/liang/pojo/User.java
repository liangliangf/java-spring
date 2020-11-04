package com.liang.pojo;

public class User {
    private String name;

    public User() {
    }

    public User(String name, Addres addres, int age) {
        this.name = name;
        this.addres = addres;
        this.age = age;
    }

    public Addres getAddres() {
        return addres;
    }

    public void setAddres(Addres addres) {
        this.addres = addres;
    }

    private Addres addres;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", addres=" + addres +
                ", age=" + age +
                '}';
    }
}
