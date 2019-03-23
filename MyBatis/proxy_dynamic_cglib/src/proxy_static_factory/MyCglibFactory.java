package proxy_static_factory;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyCglibFactory implements MethodInterceptor{   //MethodInterceptor是一个回调接口，那么MyCglibFactory的对象就是回调对象
	private SomeService target = new SomeService();
	
	public MyCglibFactory() {
		super();
	}
	
	public SomeService myCglibCreator() {
		//创建增强器对象
		Enhancer enhancer = new Enhancer();   //增强器
		//指定目标类，既父类
		enhancer.setSuperclass(SomeService.class);   
		//设置回调接口对象
		enhancer.setCallback(this);           //当前类（MyCglibFactory）对象，方便回调
		
		return (SomeService) enhancer.create();             //返回指定类的子类
	}
	//回调方法
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		//调用目标方法
		Object result = method.invoke(target, args);             //alt+shift+L：补充返回值
		if (result != null) {
			result = ((String) result).toUpperCase();            //alt+shift+Z：添加条件语句
		}
		return result;
	}

//回调设计模式：
//A类：MyCglibFactory； A方法：myCglibCreator()
//B类：Enhancer；B方法：setCallback()
//B方法在执行过程中调用了A类中的inercept() —— 回调方法         //之所以能调用是因为A在调用B方法时，将自己的对象传进去了
	
	
	
//	@Override
//	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
//		// TODO Auto-generated method stub
//		return null;
//	}                                                     //没有链接cglib源码，参数没自动更新
}
