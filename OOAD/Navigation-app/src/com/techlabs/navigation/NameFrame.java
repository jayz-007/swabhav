package com.techlabs.navigation;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NameFrame extends JFrame {

	private JTextField textfield;

	public NameFrame() {
		super();
		
		// enter name label
		JLabel label = new JLabel();
		label.setText("Enter Name :");
		label.setBounds(10, 10, 100, 100);
		textfield = new JTextField();
		textfield.setBounds(110, 50, 130, 30);
		JButton b = new JButton("Submit");
		b.addActionListener(new WelcomeFrame(this));
		b.setBounds(100, 100, 140, 40);
		this.add(textfield);
		this.add(label);
		this.add(b);
		this.setSize(300, 300);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public String getTextName() {
		return textfield.getText();
	}
}