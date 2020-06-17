package DIP.violation.test;

import DIP.violation.LogType;
import DIP.violation.TaxCalculator;

public class DIPTest {
	public static void main(String args[]) {
		TaxCalculator t = new TaxCalculator(LogType.JSON);
		System.out.println(t.calculateTax(10, 5));
		System.out.println(t.calculateTax(0, 0));
	}

}
