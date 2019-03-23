package test;

import org.apache.log4j.Logger;

public class MyTest {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(MyTest.class);           //指定记的是哪个类的日志  类名.class：获取类对象
		logger.fatal("fatal msg");
		logger.error("error msg");
		logger.warn("warn msg");
		logger.info("info msg");
		logger.debug("debug msg");
		logger.trace("trace msg");
	}

}
