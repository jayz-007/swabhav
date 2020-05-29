package OCP.solution2.test;

import OCP.solution2.DiwaliRate;
import OCP.solution2.FixedDesposit;

public class OCPTest {
	public static void main(String args[]) {
		FixedDesposit fd = new FixedDesposit(1, "jay", 1000000, 2, new DiwaliRate());
		System.out.println(fd.calculateSimpleInterest());
	}

}
