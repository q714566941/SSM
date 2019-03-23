package test;

import org.junit.Before;
import org.junit.Test;

import beans.Student;
import dao.IStudentDao;
import dao.StudentDaoImpl;

public class MyTest {
	private IStudentDao dao;
	
	@Before
	public void before() {
		dao = new StudentDaoImpl();
	}
	@Test
	public void testInsert() {
		Student student = new Student("张三", 23, 93.5);
		dao.insertStu(student);
	}
}
