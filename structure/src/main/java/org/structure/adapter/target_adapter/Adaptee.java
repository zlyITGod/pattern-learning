package org.structure.adapter.target_adapter;


//需要适配的类 : 已存在的、具有特殊功能、但不符合我们既有的标准接口的类
public class Adaptee {
	public void specificRequest() {
		System.out.println("我是被适配的类 特殊功能(相当于港版三角充电器,大陆不能用)");
	}
}
