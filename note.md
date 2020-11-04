##常用依赖
```xml
<dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```

##注解说明
@Autowired : 自动装配通过类型，名字，
如果Autowired不能唯一自动装配，则需要使用@Qualifier(value = "xx")  
@Resource: 自动装配通过名字和类型。  
@NotNull:字段标记了这个注解，说明这个字段可以为null。
@Component:组件，放在类上，说明这个类被Spring管理了，就是bean.

