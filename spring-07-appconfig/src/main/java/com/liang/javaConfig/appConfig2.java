package com.liang.javaConfig;

import com.liang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig2 {

    @Bean
    public User user2(){
        User user2= new User();
        user2.setName("小舞");
        return user2;
    }
}
