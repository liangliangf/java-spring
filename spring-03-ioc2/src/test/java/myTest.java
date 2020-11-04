import com.liang.poji.User;
import com.liang.poji.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserT userT= context.getBean("user3",UserT.class);
        userT.show();

        //System.out.println(user.equals(user2));
    }
}
