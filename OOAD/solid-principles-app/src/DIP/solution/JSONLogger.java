package DIP.solution;

public class JSONLogger implements ILogType {

	@Override
	public void log(Exception e) {
		System.err.println("Error writing to JSON Logger ");
		System.err.println("Error msg : "+e.getMessage());
		
	}

}
