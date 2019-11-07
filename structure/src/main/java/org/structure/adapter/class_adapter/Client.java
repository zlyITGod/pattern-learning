package org.structure.adapter.class_adapter;

public class Client {
	public static void main(String[] args) {
		//使用普通功能
		Target concrereTarget = new ConcrereTarget();
		concrereTarget.request();//普通类 具有 普通功能...
		
		// 使用特殊功能类，即适配类
		Target adapter = new Adapter();
		adapter.request();//我是被适配的类 特殊功能(相当于港版三角充电器,大陆不能用)
	}
}
