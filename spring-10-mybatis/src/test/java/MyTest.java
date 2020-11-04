import com.liang.mapper.UserMapper;
import com.liang.pojo.User;
import com.liang.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void test1() throws IOException {
        String mybatisConfig="mybatisConfig.xml";
        InputStream inputStream= Resources.getResourceAsStream(mybatisConfig);
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession= sqlSessionFactory.openSession(true);
        UserMapper userMapper= sqlSession.getMapper(UserMapper.class);
        List<User> users= userMapper.queryList();
        for (User user :users){
            System.out.println(user.toString());
        }
    }

    @Test
    public void test2(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        UserMapper userMapper= sqlSession.getMapper(UserMapper.class);
        List<User> list= userMapper.queryList();
        for(User user:list){
            System.out.println(user.toString());
        }
    }

}
