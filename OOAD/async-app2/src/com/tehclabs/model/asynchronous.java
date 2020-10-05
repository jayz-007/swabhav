package com.tehclabs.model;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class asynchronous {
	
	public asynchronous() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new GridLayout(1,2));
		JButton hello = new JButton("hello");
		JButton print = new JButton("print");
		hello.addActionListener(new Hello());
		print.addActionListener(new Print());
		frame.setVisible(true);
		frame.setSize(500, 500);
		panel.add(hello);
		panel.add(print);
		frame.add(panel);
		
	
	}

}
