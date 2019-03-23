package test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public void test08() {
		Student stu = new Student("田七",27,95);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("nameCon", "张");
		map.put("ageCon", 23);
		map.put("stu", stu);
		
		List<Student> students = dao.selectStudentsByCondition(map);
		for (Student student : students) {
			System.out.println(student);                         //自动调用toString方法
		}
	}
}
