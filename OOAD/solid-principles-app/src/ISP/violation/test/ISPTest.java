package ISP.violation.test;

import ISP.violation.IWorker;
import ISP.violation.Manager;
import ISP.violation.Robot;

public class ISPTest {
	public static void main(String args[]) {
		IWorker robot = new Robot();
		IWorker manager = new Manager();
		
		atTheWorkStation(manager);
		atTheCafeteria(manager);
		
		atTheWorkStation(robot);
		atTheCafeteria(robot);
	}

	public static void atTheCafeteria(IWorker w) {
		w.startEat();
		w.stopEat();
	}

	public static void atTheWorkStation(IWorker w) {
		w.startWork();
		w.stopWork();
	}
}
