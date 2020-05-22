package com.techlabs.model.ISP.test;

import com.techlabs.model.ISP.Cat;
import com.techlabs.model.ISP.IAnimal;
import com.techlabs.model.ISP.IPet;
import com.techlabs.model.ISP.Tiger;

public class Test {

	public static void main(String[] args) {
		IPet pet = new Cat();
		pet.feed();
		pet.groom();
		
		IAnimal animal = new Tiger();
		animal.feed();

	}

}