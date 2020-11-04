import com.liang.pojo.Student;
import com.liang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student.toString());
        //Student{name='张三丰', address=Addres{address='北京'}, books=[红楼梦, 西游记, 水浒传, 三国演义], hobbys=[足球, 看电影], card={身份证=11000000000000, 银行卡=999988885555}, games=[LoL, BoB, CoC], wife='null', info={passWord=123456, url=男, driver=1102, userName=root}}
    }

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user.toString());
    }
}
