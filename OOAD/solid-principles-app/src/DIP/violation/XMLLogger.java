package DIP.violation;

public class XMLLogger {
	public void Log(Exception e) {
		System.err.println("Error writing to XML file:  " + e.getMessage());
	}

}
