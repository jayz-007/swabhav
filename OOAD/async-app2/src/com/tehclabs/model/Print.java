package com.tehclabs.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Print implements ActionListener, Runnable {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Thread t = new Thread(this);
		t.start();

	}

	@Override
	public void run() {
		for (;;) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			System.out.println(dtf.format(now));

		}

	}
}
