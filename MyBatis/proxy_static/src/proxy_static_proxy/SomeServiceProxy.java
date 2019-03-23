package proxy_static_proxy;

import proxy_static_service.ISomeService;
import proxy_static_service.SomeServiceImpl;

//代理类
public class SomeServiceProxy implements ISomeService {            //代理类和目标类有相同的接口

	private ISomeService target;
	public SomeServiceProxy(){
		target = new SomeServiceImpl();       //构造函数
	}
	@Override
	public String doFirst() {
		//代理类调用目标方法
		String result = target.doFirst();
		//增强发生在这里
		return result.toUpperCase();
	}

	@Override
	public void doSecond() {
		target.doSecond();
	}

}
