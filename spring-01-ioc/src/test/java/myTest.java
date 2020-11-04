import com.liang.dao.UserDao;
import com.liang.dao.UserMSSqlDaoIImpl;
import com.liang.dao.UserMysqlDaoImpl;
import com.liang.service.UserService;
import com.liang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        UserService userService= context.getBean("userServiceImpl",UserServiceImpl.class);
        userService.getUser();
    }
}
