package com.tehclabs.model;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Hello implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame hello = new JFrame();
		JTextArea text = new JTextArea();
		hello.setVisible(true);
		hello.setSize(100, 100);
		text.setText("Hello");
		hello.add(text);
		
		
	}
	

}
