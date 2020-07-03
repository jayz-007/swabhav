package com.techlabs.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	public MainFrame(String value) {
		super(value);
		this.setVisible(true);
		this.setSize(500, 500);
		JPanel p = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b1 = new JButton("Button 1");
		p.add(b1);
		p.setBackground(Color.CYAN);
		this.add(p);
		b1.addActionListener(new EmailListener());
		b1.addActionListener(new SMSListener());

	}

}
