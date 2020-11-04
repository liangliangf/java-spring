package com.liang.javaConfig;

import com.liang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration这个注解，也会被Spring容器托管，注册到容器中，因为他也是一个@Component,@Configuration代表一个配置类，就和beans.xml一样
@Configuration
@ComponentScan("com.liang.pojo") //也可以在这里配置扫描包
@Import(appConfig2.class)//导入其他配置
public class appConfig {

    //注册一个bean，就相当于xml中的一个bean标签
    //这个方法的名字，就相当于bean中的Id
    //这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User user(){
        return new User();//就是要返回要注入Bean中的对象
    }
}
