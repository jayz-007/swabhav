package DIP.violation;

public class JSONLogger {
	public void Log(Exception e) {
		System.err.println("Error writing to Json file:  " + e.getMessage());
	}

}
