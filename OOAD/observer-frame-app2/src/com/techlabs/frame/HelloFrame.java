package com.techlabs.frame;

import java.awt.Button;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.JTextComponent.KeyBinding;

public class HelloFrame extends JFrame {
	private JButton red;
	private JButton green;
	private JPanel p;

	public HelloFrame(String value) {
		super(value);
		this.setVisible(true);
		this.setSize(500, 500);
		p = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		red = new JButton("red");
		green = new JButton("green");
		p.add(red);
		p.add(green);
		p.setBackground(Color.BLACK);
		this.add(p);
		red.addActionListener(new CommonListener(this));
		green.addActionListener(new CommonListener(this));

	}

	public JButton getRedButton() {
		return red;
	}

	public JPanel getPanel() {
		return p;
	}

	public JButton getGreenButton() {
		return green;
	}

}