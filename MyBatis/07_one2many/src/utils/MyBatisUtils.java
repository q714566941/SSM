package utils;


import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	private static SqlSessionFactory sqlSessionFactory;

	public static SqlSession getSqlSession() {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			if (sqlSessionFactory == null) {             //第一次调用的时候创建，以后都用这个工厂
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}
			return sqlSessionFactory.openSession();     //线程安全（没有可变变量），系统开销大
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;                          //函数需要返回值
	}
}
