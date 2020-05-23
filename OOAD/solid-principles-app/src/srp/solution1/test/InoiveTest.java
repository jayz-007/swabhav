package srp.solution1.test;

import java.util.UUID;

import srp.solution1.Invoice;

public class InoiveTest {
	public static void main(String args[]) {
		Invoice invoice = new Invoice(UUID.randomUUID(), "jay", 100, 25f);
		print(invoice);
	}
	
	public static void print(Invoice invoice) {
		System.out.println("Details of invoice are: ");
		System.out.println("ID is : "+invoice.getId());
		System.out.println("Name is: "+invoice.getName());
		System.out.println("Cost is: "+ invoice.getCost());
		System.out.println("Discount percentage is: "+ invoice.getDiscountPercentage());
		System.out.println("GST is : "+invoice.getGST()+"%");
		System.out.println("Final cost is : " + invoice.calculateTotalCost());
	}

}
