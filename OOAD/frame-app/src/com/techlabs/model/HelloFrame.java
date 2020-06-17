package com.techlabs.model;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloFrame extends JFrame {
	public HelloFrame(String name) {
		super(name);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);

		JPanel jp = new JPanel();
		jp.setAlignmentX(Component.CENTER_ALIGNMENT);
		jp.setAlignmentY(Component.CENTER_ALIGNMENT);

		JButton btn1 = new JButton("Click");
		JButton btn2 = new JButton("Click");
		
		jp.add(btn1);
		jp.add(btn2);

		jp.setBackground(Color.blue);

		this.add(jp);

	}

}
