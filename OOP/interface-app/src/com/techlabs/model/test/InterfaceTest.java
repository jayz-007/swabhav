package com.techlabs.model.test;

import com.techlabs.model.Boy;
import com.techlabs.model.IEmotional;
import com.techlabs.model.IMannerable;
import com.techlabs.model.Man;

public class InterfaceTest {
	public static void main(String args[]) {
		Boy boy = new Boy();
		Man man = new Man();
		
	

		atThePartyHall(man);
		// atTheCinemaHall(man); Compile Time Error

		atTheCinemaHall(boy);
		atThePartyHall(boy);

	}

	public static void atTheCinemaHall(IEmotional obj) {
		System.out.println("At the party hall");
		obj.cry();
		obj.laughs();

	}

	public static void atThePartyHall(IMannerable obj) {
		System.out.println("At the party hall");
		obj.wish();
		obj.depart();
	}

}
