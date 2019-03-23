/**
 * 
 */
package dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import beans.Student;

/**
 * @author hjh
 *
 */
public class StudentDaoImpl implements IStudentDao {

	private SqlSession sqlSession;

	@Override
	public void insertStu(Student student) {
		try {
			//1.加载主配置文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");  //主配置文件
			//2.创建SqlSessionFactory对象
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession = sqlSessionFactory.openSession();
			//4.相关操作
			sqlSession.insert("reyco.insertStudent", student);          //arg0:statement(用id标识，)；arg1:待插入对象(值传入statement中)
			sqlSession.insert("insertS", student);                     //两种调用statement方法
			
			sqlSession.commit();                                  //提交以后才能写入数据库？？？；当时执行了insert语句那么id就给出去了，下一句从下一个id开始
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null){
				sqlSession.close();                              //sqlSession添加close就不用事务的rollback了？？？
				                                                 //inputStream不用关闭？？？
			}
		}

	}

}
