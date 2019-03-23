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

public class StudentDaoImpl implements IStudentDao {

	private SqlSession sqlSession;

	@Override
	public void insertStu(Student student) {
		try {
			//1.加载主配置文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");  //主配置文件在src下(不是在某个包底下)
			//2.创建SqlSessionFactory对象
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//3.获取SqlSession对象，通过其进行相关操作
			sqlSession = sqlSessionFactory.openSession();
			//4.相关操作（insert/delete/update...）
			sqlSession.insert("insertStudent", student);          //insert:mapper.xml中insert标签;arg0:映射文件中statement的id；arg1:待插入对象(值传入statement中)
			
			sqlSession.commit();                                  //提交以后才能写入数据库？？？；当时执行了insert语句那么id就给事务了，下一句从下一个id开始
			                                                      //没有commit的时候sqlSession.close()会执行回滚操作，导致事务没有被提交，导致数据没能写入数据库
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
