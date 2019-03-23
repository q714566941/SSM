package test;

import org.junit.Before;
import org.junit.Test;

import beans.Student;
import dao.IStudentDao;
import dao.StudentDaoImpl;

public class MyTest {
	private IStudentDao dao;
	
	@Before                                            //巧在测试之前初始化
	public void before() {
		dao = new StudentDaoImpl();
	}
	@Test
	public void testInsert() {
		Student student = new Student("张三", 23, 93.5);      //待写入数据库的对象
		dao.insertStu(student);
	}
}
