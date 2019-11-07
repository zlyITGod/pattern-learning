package org.structure.decorate.example1;

//汉堡基类(被装饰者) 也就是Component,被装饰对象的基类
public abstract class Humburger {

	protected String name;
	
	public String getName() {
		return name;
	}
	 
	public abstract double getPrice() ;
	
}
