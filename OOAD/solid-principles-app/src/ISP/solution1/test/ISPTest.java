package ISP.solution1.test;

import ISP.solution1.IHuman;
import ISP.solution1.IMachine;
import ISP.solution1.IWorker;
import ISP.solution1.Manager;
import ISP.solution1.Robot;

public class ISPTest {
	public static void main(String args[]) {
		IHuman manager = new Manager();
		IMachine robot = new Robot();

		atTheWorkStation(manager);
		atTheCafeteria(manager);

		atTheWorkStation(robot);
		atTheCafeteria(robot);
	}

	public static void atTheCafeteria(IMachine m) {
		m.cannotEat();

	}

	public static void atTheCafeteria(IHuman h) {
		h.startEat();
		h.stopEat();

	}

	public static void atTheWorkStation(IWorker w) {
		w.startWork();
		w.stopWork();
	}
}
