package DIP.violation;

public class TextLogger {
	public void Log(Exception e) {
		System.err.println("Error writing to text file:  " + e.getMessage());
	}

}
