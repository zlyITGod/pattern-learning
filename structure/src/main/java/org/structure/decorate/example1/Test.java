package org.structure.decorate.example1;

public class Test {
	public static void main(String[] args) {
		Humburger humburger = new ChickenBurger();
		System.out.println(humburger.getName()+humburger.getPrice());
		//鸡腿堡15.0
		Condiment condiment = new Lettuce(new Chilli(new Beef(humburger)));
		System.out.println(condiment.getName()+condiment.getPrice());
		//鸡腿堡加肉加辣椒加生菜22.0 
		
	}
}
