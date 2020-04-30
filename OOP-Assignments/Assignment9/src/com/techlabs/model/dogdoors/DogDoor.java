package com.techlabs.model.dogdoors;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

	private boolean open;
	private String allowedBark;
	List barkList = new ArrayList();

	public DogDoor() {
		this.open = false;
	}

	public void addAllowedBark(Bark bark) {
		barkList.add(bark);
	}

	public List getAllowedBarks() {
		return barkList;
	}

	public void open() {
		System.out.println("The dog door opens.");
		open = true;

		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}

	public void close() {
		System.out.println("The dog door closes.");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}
}