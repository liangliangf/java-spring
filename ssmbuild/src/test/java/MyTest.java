import com.liang.dao.StudentMapper;
import com.liang.pojo.T_student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        StudentMapper studentMapper = context.getBean("StudentServiceImpl", StudentMapper.class);
        List<T_student> list= studentMapper.queryAll();
        for(T_student student : list){
            System.out.println(student.toString());
        }
    }
}
