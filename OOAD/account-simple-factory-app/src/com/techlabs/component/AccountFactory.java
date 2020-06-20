package com.techlabs.component;

public class AccountFactory {
	private static AccountFactory factory;

	private AccountFactory() {
		// TODO Auto-generated constructor stub
	}

	public Account make(AccountType type) {
		if (type == AccountType.SA)
			return new SA();
		if (type == AccountType.CA)
			return new CA();
		return null;
		
	}

	public static AccountFactory getInstance() {
		if (factory == null) {
			factory = new AccountFactory();
			return factory;
		}
		return factory;
	}

}
