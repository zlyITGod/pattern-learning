package org.structure.decorate.example1;

//鸡腿堡类(被装饰者的初始状态)  也就是ConcreteComponent,具体被装饰的对象
public class ChickenBurger extends Humburger {


	public ChickenBurger() {
		name = "鸡腿堡";
	}

	@Override
	public double getPrice() {
		return 15;
	}

	

}
