import com.homejim.mybatis.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class StudentMapperTest {
    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init() {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectList() {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            //泛型数据数组 Student类型
//            List<Student> students = sqlSession.selectList("selectAll");
//            for (int i = 0; i < students.size(); i++) {
//
//                //前面一个是List容器数组的方法，后面一个是对象自带的方法，用于获得该对象的名字。
//
//                System.out.println(students.get(i).getInfo());
//
//            }
//            System.out.println("下面打印单个ID查询数据");
//            //根据id查询信息
//            Student a = sqlSession.selectOne("selectByPrimaryKey",6);
//            System.out.println(a.getInfo());

        sqlSession.selectOne("updateByPrimaryKey",6);



            System.out.println(a.getInfo());



        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}

//    @Test
//    public void selectId() {
//        SqlSession sqlSession = null;
//        try {
//            sqlSession = sqlSessionFactory.openSession();
//            //泛型数据数组 Student类型
//            Student a = sqlSession.selectOne("selectByPrimaryKey",5);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        } finally {
//            if (sqlSession != null) {
//                sqlSession.close();
//            }
//        }
//    }
//}

