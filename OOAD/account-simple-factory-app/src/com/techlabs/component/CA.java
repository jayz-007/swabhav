package com.techlabs.component;

public class CA extends Account {
	public CA() {
		super(AccountType.CA);
	}

	private static final double MINIMUM_AMOUNT = 0;

	@Override
	public void withdraw(double amount) throws MinimumBalanceException  {
		if(MINIMUM_AMOUNT<=(this.amount - amount)) {
			this.amount = this.amount - amount;
			
		}
		else 
			throw new MinimumBalanceException(this);
		

	}
	

}


