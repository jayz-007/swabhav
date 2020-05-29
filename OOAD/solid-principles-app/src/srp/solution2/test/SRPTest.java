package srp.solution2.test;

import java.util.UUID;

import srp.solution2.Invoice;
import srp.solution2.InvoicePrinter;

public class SRPTest {
	public static void main (String args[]) {
		Invoice invoice = new Invoice(UUID.randomUUID(), "jay", 100, 25);
		new InvoicePrinter().print(invoice);
	}

}
