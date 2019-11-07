package org.structure.adapter.class_adapter;



//具体目标类，只提供普通功能
public class ConcrereTarget implements Target {

	@Override
	public void request() {
		System.out.println("普通类 具有 普通功能...");

	}

}
