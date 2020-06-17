package ISP.violation;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("start work");

	}

	@Override
	public void stopWork() {
		System.out.println("stop work");

	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robot cannot eat");
	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robot cannot eat");
	}

}
