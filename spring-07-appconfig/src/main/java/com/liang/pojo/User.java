package com.liang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //这个注解的意思，就是说明这个类被Spring接管了，注册到了Spring容器中
public class User {

    private String name;

    @Value("唐三") //属性注入
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
