package DIP.solution.test;

import DIP.solution.JSONLogger;
import DIP.solution.TaxCalculator;
import DIP.solution.XMLLogger;

public class DIPTest {
	public static void main(String args[]) {
		TaxCalculator t = new TaxCalculator(new JSONLogger());
		System.out.println(t.calculateTax(10, 5));
		System.out.println(t.calculateTax(0, 0));
	}

}
