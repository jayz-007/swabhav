package com.techlabs.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmailListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("email notification of order ");
	}

}
