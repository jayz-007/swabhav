
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time implements ActionListener,Runnable {

	@Override
	public void actionPerformed(ActionEvent arg0) {
	Thread thread = new Thread(this);
	thread.start();

	}

	@Override
	public void run() {
		for (;;) {
			DateTimeFormatter currentTime = DateTimeFormatter.ofPattern(" HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			System.out.println(currentTime.format(now));
		}
		
	}

}
