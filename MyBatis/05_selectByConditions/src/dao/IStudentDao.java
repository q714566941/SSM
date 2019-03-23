package dao;



import java.util.List;
import java.util.Map;

import beans.Student;

public interface IStudentDao {
	List<Student> selectStudentsByCondition(String name, int age);          //多条件查询
}
