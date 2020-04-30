package com.techlabs.model.test;

import com.techlabs.model.Bike;
import com.techlabs.model.Car;
import com.techlabs.model.IMovable;
import com.techlabs.model.Truck;

public class MovableTest {
	public static void main (String args[]) {
		IMovable[] vehicles = {new Car(),new Bike() , new Truck()};
		startRace(vehicles);
	}
	
	public static void startRace(IMovable[] movable) {
		for (IMovable vehicle : movable) {
			vehicle.move();
		}
	}

}
