package DIP.solution;

public class TextLogger implements ILogType {

	@Override
	public void log(Exception e) {
		System.err.println("Error writing to Text Logger ");
		System.err.println("Error msg : "+e.getMessage());
		
	}

}
