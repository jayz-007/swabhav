package com.techlabs.navigation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeFrame implements ActionListener {

	private NameFrame frame;

	public WelcomeFrame(NameFrame frame) {
		this.frame = frame;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JFrame frame2 = new JFrame("Clicked");
		JPanel panel = new JPanel();
		frame2.setVisible(true);
		frame2.setSize(200, 200);
		JLabel label = new JLabel();
		label.setBounds(10, 110, 200, 100);
		label.setText("Welcome "+frame.getTextName());
		
		frame2.add(panel);
		panel.add(label);

	}

}