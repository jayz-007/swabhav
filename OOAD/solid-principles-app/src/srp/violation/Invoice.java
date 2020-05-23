package srp.violation;

import java.util.UUID;

public class Invoice {
	private UUID id ;
	private String name;
	private double cost;
	private float discountPercentage;
	private final static float GST;
	
	static {
		GST = 12f;
		
	}
	
	public Invoice(UUID id, String name,double cost, float discountPercentage) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discountPercentage = discountPercentage;
		// TODO Auto-generated constructor stub
	}
	
	public double calculateTax() {
		return(this.cost*(GST/100));
	}
	
	public double calculateDiscountAmount() {
		return (this.cost*(1-(discountPercentage/100)));
	}
	
	public double calculateTotalCost() {
		return(calculateDiscountAmount()+calculateTax());
	}
	
	public void print() {
		System.out.println("Details of invoice are: ");
		System.out.println("ID is : "+id);
		System.out.println("Name is: "+name);
		System.out.println("Cost is: "+ cost);
		System.out.println("Discount percentage is: "+ discountPercentage);
		System.out.println("GST is : "+GST+"%");
		System.out.println("Final cost is : " + calculateTotalCost());
	}

}
