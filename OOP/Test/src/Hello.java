
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Hello implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame hello = new JFrame();
		hello.setVisible(true);
		hello.setSize(100, 100);
		System.out.println("Hello");
		
		
	}
	

}
