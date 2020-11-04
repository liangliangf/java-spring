import com.liang.mappers.UserMapper;
import com.liang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test01(){
        ApplicationContext context= new ClassPathXmlApplicationContext("mybatis-spring.xml");
        UserMapper userMapper= context.getBean("userMapper",UserMapper.class);
        List<User> list= userMapper.queryList();
        for(User user :list){
            System.out.println(user.toString());
        }
    }
}
