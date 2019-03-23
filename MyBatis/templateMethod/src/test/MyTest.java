package test;

import service.ClothesShopping;
import service.ShoesShopping;
import service.shopping;

public class MyTest {

	public static void main(String[] args) {
		shopping shoesShopping = new ShoesShopping();
		shoesShopping.buyGoods();
		System.out.println("-----------------------------------------------");
		
		shopping clothesShopping = new ClothesShopping();
		clothesShopping.buyGoods();
	}

}
