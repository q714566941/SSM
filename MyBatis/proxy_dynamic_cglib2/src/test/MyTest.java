package test;

import proxy_static_factory.MyCglibFactory;
import proxy_static_service.ISomeService;

public class MyTest {

	public static void main(String[] args) {
		ISomeService service = new MyCglibFactory().myCglibCreator();   //获取cglib代理
		
		String result = service.doFirst();                       
		System.out.println("result: " + result);                
		service.doSecond();
	}
}
