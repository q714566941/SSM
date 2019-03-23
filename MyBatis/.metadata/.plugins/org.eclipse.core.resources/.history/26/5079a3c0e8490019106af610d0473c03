package test;

import proxy_static_proxy.SomeServiceProxy;
import proxy_static_service.ISomeService;
import proxy_static_service.SomeServiceImpl;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISomeService service = new SomeServiceProxy();             //实现类才可以被初始化
		String result = service.doFirst();                        //利用静态代理实现返回ABCDE(不是利用toUpperCase())
		System.out.println("result: " + result);                
		service.doSecond();
	}
}
