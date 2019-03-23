package test;


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
	public void test01() {
		Student student = new Student("张三", 23, 93.5);
		System.out.println("插入前：student" + student);
		dao.insertStudent(student);
		System.out.println("插入后：student" + student);
		sqlSession.commit();
	}
	
	@Test
	public void test02() {
		Student student = new Student("张三", 23, 93.5);
		System.out.println("插入前：student" + student);
		dao.insertStudenCacheId(student);
		System.out.println("插入后：student" + student);               //获取到了数据库分配的id
		sqlSession.commit();
	}
	
	@Test
	public void test03() {
		dao.deleteStudentById(3);
	}
	
	@Test
	public void test04() {
		Student student = new Student("王麻子", 23, 93.5);
		student.setId(12);
		dao.updateStudent(student);
		sqlSession.commit();
	}
	
	@Test
	public void test05() {
		List<Student> students = dao.selectAllStudents();
		for (Student student : students) {
			System.out.println(student);                         //自动调用toString方法
		}
	}
	
//	@Test
//	public void test06() {
//		Map<String, Object> map = dao.selectAllStudentsMap();     //相应的maper.xml中没有这个id
//		System.out.println(map.get("张三"));
//	}
	
	@Test
	public void test07() {
		Student student = dao.selectStudentById(10);
		System.out.println(student);
	}
	
	@Test
	public void test08() {
		List<Student> students = dao.selectStudentsByName("张");
		for (Student student : students) {
			System.out.println(student);                         //自动调用toString方法
		}
	}
}
