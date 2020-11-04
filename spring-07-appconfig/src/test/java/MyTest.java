import com.liang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.liang.javaConfig.appConfig;

public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式去做，我们就只能通过 AnnotationConfigApplicationContext 获取上下文对象，通过配置对象类的class加载
        ApplicationContext context= new AnnotationConfigApplicationContext(appConfig.class);
        User user2= context.getBean("user2", User.class);
        User user= context.getBean("user", User.class);
        System.out.println(user.getName()+"==="+user2.getName());
    }
}
