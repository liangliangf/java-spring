import com.liang.mapper.UserMapper;
import com.liang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper= context.getBean("userMapper", UserMapper.class);

        List<User> list=userMapper.queryList();
        for(User user :list){
            System.out.println(user);
        }
    }
}
