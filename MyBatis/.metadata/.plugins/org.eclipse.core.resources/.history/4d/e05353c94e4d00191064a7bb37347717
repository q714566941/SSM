package test;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import beans.Minister;
import dao.IMinisterDao;
import utils.MyBatisUtils;

public class MyTest {
	private IMinisterDao dao;
	private SqlSession sqlSession;
	
	@Before
	public void before() {
		sqlSession = MyBatisUtils.getSqlSession();
		dao = sqlSession.getMapper(dao.IMinisterDao.class);          //getMapper：通过mapper.xml中的namespace找到相应mapper
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
		Minister minister = dao.selecMinisterById(2);
		System.out.println(minister);
	}
}
