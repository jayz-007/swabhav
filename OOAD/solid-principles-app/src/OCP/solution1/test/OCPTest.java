package OCP.solution1.test;

import OCP.solution1.Festival;
import OCP.solution1.FixedDesposit;

public class OCPTest {
	public static void main(String args[]) {
		FixedDesposit fd = new FixedDesposit(10, "jay", 1000000, 2, Festival.Diwali);
		System.out.println(fd.calculateSimpleInterest());
	}

}
