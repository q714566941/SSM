package service;

public abstract class shopping {
	//模板方法（子类都有一样的步骤）
	public void buyGoods(){
		userLogin();
		buy();
		pay();
	}

	//子类不能重写的方法
	public final void userLogin() {         
		System.out.println("用户登陆");
	}

	//子类必须实现的方法
	public abstract void buy();
	//钩子方法（子类可重写的）
	public void name() {
		
	} void pay() {
		System.out.println("使用银联支付");
	}
}
	

