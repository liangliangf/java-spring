package com.liang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;
import javax.print.Doc;

public class People {

    //如果Autowired(required = false)，则允许这个对象可以为null,否则不允许为空
    @Autowired
    @Qualifier(value = "cat1") //多个cat时，筛选指定注入内容
    private Cat cat;

    @Resource(name = "dog2",type =Dog.class)

    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
