
public class Singleton {

	private static Singleton sin = new Singleton();

	private Singleton() {
		System.out.println("New Sin");
	}
	
	public static Singleton getInst() {
		return sin;
	}
}
