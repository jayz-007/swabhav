package com.techlabs.service.test;

import com.techlabs.service.DataServiceEnum;

public class EnumTest {
	public static void main(String args[]) {
		DataServiceEnum sv1 = DataServiceEnum.INSTANCE;
		System.out.println(sv1.hashCode());
		sv1.doSomething();
		
		
		DataServiceEnum sv2 = DataServiceEnum.INSTANCE;
		System.out.println(sv2.hashCode());
		sv2.doSomething();
	}

}
