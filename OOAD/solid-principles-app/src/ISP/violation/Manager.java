package ISP.violation;

public class Manager implements IWorker {

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
		System.out.println("start eat");
		
	}

	@Override
	public void stopEat() {
		System.out.println("stop eat");
		
	}

}
