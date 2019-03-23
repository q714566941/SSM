package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyTest {

	@Before           //每个测试方法执行前先要执行的方法
	public void setUp() throws Exception {
		System.out.println("执行setup()");
	}

	@After             //每个测试方法执行之后要执行的方法
	public void tearDown() throws Exception {
		System.out.println("执行tearDown()");
	}

	@Test
	public void test() {
		System.out.println("运行test()");
	}

}
