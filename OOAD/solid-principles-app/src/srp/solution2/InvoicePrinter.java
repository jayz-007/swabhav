package srp.solution2;

import srp.solution2.Invoice;

public class InvoicePrinter {
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
