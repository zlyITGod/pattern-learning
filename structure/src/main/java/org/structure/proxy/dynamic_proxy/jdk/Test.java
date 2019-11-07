package org.structure.proxy.dynamic_proxy.jdk;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		Account account = new AccountImpl();
		MyInvocationHandler myInvocationHandler = new MyInvocationHandler(account);
		Account accountProxy = (Account)Proxy.newProxyInstance(
				account.getClass().getClassLoader()
			  , account.getClass().getInterfaces()
			  , myInvocationHandler);
		accountProxy.queryAccount();
		System.out.println("-------");
		accountProxy.updateAccount();
	}
}
