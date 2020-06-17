package DIP.solution;

public class XMLLogger implements ILogType {

	@Override
	public void log(Exception e) {
		System.err.println("Error writing to XML Logger ");
		System.err.println("Error msg : "+e.getMessage());
		
	}
	

}
