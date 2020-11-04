import com.liang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在在Spring中管理了，我们要使用，直接去里面取出来就可以了
        Hello hello= context.getBean("hello", Hello.class);
        System.out.println(hello.toString());
    }
}
