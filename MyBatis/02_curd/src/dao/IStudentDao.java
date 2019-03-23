package dao;



import java.util.List;
import java.util.Map;

import beans.Student;

public interface IStudentDao {
	//插入
	void insertStudent(Student student);
	void insertStudenCacheId(Student student);
	//删除
	void deleteStudentById(int id);
	//修改
	void updateStudent(Student student);
	
	//查询
	List<Student> selectAllStudents();
	Map<String, Object> selectAllStudentsMap();
	Student selectStudentById(int id);
	List<Student> selectStudentsByName(String name);          //根据名字模糊查询
}
