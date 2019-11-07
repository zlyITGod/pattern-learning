package org.structure.proxy.dynamic_proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class MyInvocationHandler implements InvocationHandler {
	
	private Object target;

	public MyInvocationHandler() {
		super();
	}

	public MyInvocationHandler(Object target) {
		super();
		this.target = target;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		System.out.println("---before---");
		//执行方法
		result = method.invoke(target, args);
		System.out.println("---after---");
		return result;
	}

	

}
