package dao;

import beans.Student;

public interface IStudentDao {
	Student selectStudentById(int id);
}
