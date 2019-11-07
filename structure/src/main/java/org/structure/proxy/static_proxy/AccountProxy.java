package org.structure.proxy.static_proxy;

public class AccountProxy implements Account {

	private AccountImpl accountImpl;
	
	public AccountProxy(AccountImpl accountImpl) {
		this.accountImpl = accountImpl;
	}

	@Override
	public void queryAccount() {
		System.out.println("处理业务之前");
		accountImpl.queryAccount();
		System.out.println("处理业务之后");
	}

	@Override
	public void updateAccount() {
		System.out.println("处理业务之前");
		accountImpl.updateAccount();
		System.out.println("处理业务之后");
	}

}
