package org.structure.proxy.static_proxy;

public class Test {
	public static void main(String[] args) {
		AccountImpl accountImpl = new AccountImpl();
		AccountProxy accountProxy = new AccountProxy(accountImpl);
		accountProxy.updateAccount();
	}
}
