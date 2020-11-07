
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Synchronous {
	
	public Synchronous() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new GridLayout(1,2));
		JButton hello = new JButton("hello");
		JButton print = new JButton("Time");
		hello.addActionListener(new Hello());
		print.addActionListener(new Time());
		frame.setVisible(true);
		frame.setSize(500, 500);
		panel.add(hello);
		panel.add(print);
		frame.add(panel);
		
	
	}

}
