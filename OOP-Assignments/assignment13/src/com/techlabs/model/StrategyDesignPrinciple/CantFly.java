package com.techlabs.model.StrategyDesignPrinciple;

public class CantFly implements IFlys {

	@Override
	public String fly() {
		return "Can't Fly";
	}

}