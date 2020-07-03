package com.techlabs.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloFrame extends JFrame {

	public HelloFrame(String value) {
		super(value);
		this.setVisible(true);
		this.setSize(500, 500);
		JPanel p = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		p.add(b1);
		p.add(b2);
		p.setBackground(Color.CYAN);
		this.add(p);
		b1.addActionListener(new Action());
		b2.addActionListener(new Action());

	}

	static class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame frame2 = new JFrame("Clicked");
			frame2.setVisible(true);
			frame2.setSize(200, 200);
			JLabel label = new JLabel("Hello!");
			JPanel panel = new JPanel();
			frame2.add(panel);
			panel.add(label);

		}

	}

}