package test;


import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import beans.Student;
import dao.IStudentDao;
import utils.MyBatisUtils;

public class MyTest {
	private IStudentDao dao;
	private SqlSession sqlSession;
	
	@Before
	public void before() {
		sqlSession = MyBatisUtils.getSqlSession();
		dao = sqlSession.getMapper(dao.IStudentDao.class);          //getMapper：通过mapper.xml中的namespace找到相应mapper
		                                                            //dao是一个jdkdongtaidail
	}
	@After
	public void After(){
		if(sqlSession != null){
			sqlSession.close();                              
		}
	}
	
	@Test
	public void test01() {
		Student student = dao.selectStudentById(1);
		System.out.println(student);
	}
}
