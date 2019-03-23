package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import beans.NewsLabel;
import dao.INewsLabelDao;
import utils.MyBatisUtils;

public class MyTest {
	private INewsLabelDao dao;
	private SqlSession sqlSession;
	
	@Before
	public void before() {
		sqlSession = MyBatisUtils.getSqlSession();
		dao = sqlSession.getMapper(dao.INewsLabelDao.class);          //getMapper：通过mapper.xml中的namespace找到相应mapper
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
		List<NewsLabel> children = dao.selectChildrenByPid(2);
		for (NewsLabel newsLabel : children) {
			System.out.println(newsLabel);
		}
	}
}
