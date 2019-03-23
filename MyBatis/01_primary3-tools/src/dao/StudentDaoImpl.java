/**
 * 
 */
package dao;


import org.apache.ibatis.session.SqlSession;

import beans.Student;
import utils.MyBatisUtils;

/**
 * @author hjh
 *
 */
public class StudentDaoImpl implements IStudentDao {
	private SqlSession sqlSession;

	@Override
	public void insertStu(Student student) {
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			sqlSession.insert("insertStudent", student);          
			sqlSession.commit();                                  
		}finally {
			if(sqlSession != null){
				sqlSession.close();                              
			}
		}
	}

}
