package com.techlabs.component;

public class SA extends Account {
	public SA() {
		super(AccountType.SA);
	}

	private static final double MINIMUM_AMOUNT = 5000;

	@Override
	public void withdraw(double amount) throws MinimumBalanceException {
		if(MINIMUM_AMOUNT<(this.amount - amount)) {
			this.amount = this.amount - amount;
			
		}
		else
			throw new MinimumBalanceException(this);

	}
	

}
