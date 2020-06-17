package ISP.solution1;

public class Robot implements IMachine {

	@Override
	public void startWork() {
		System.out.println("start work");

	}

	@Override
	public void stopWork() {
		System.out.println("stop work");

	}

	@Override
	public void cannotEat() {
		System.out.println("Robot cannot eat");
		
	}

	

}
