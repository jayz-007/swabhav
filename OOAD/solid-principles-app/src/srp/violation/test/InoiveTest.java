package srp.violation.test;

import java.util.UUID;

import srp.violation.Invoice;

public class InoiveTest {
	public static void main(String args[]) {
		Invoice invoice = new Invoice(UUID.randomUUID(), "jay", 100, 25f);
		invoice.print();
	}
	
	

}
