package com.techlabs.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class CommonListener implements ActionListener {
	private HelloFrame frame;

	public CommonListener(HelloFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("hello");
		if (e.getSource() == frame.getRedButton()) 
			frame.getPanel().setBackground(Color.RED);
		if(e.getSource() == frame.getGreenButton())
			frame.getPanel().setBackground(Color.GREEN);
		
		
	}
}