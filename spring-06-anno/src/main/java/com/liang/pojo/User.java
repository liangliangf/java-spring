package com.liang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public class User {

    public String getName() {
        return name;
    }

    @Value("张三")
    private String name;

}
