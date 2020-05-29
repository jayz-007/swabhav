package srp.solution2;

import java.util.UUID;

public class Invoice {
	private UUID id;
	private String name;
	private double cost;
	private float discountPercentage;
	private final static float GST;

	static {
		GST = 12f;

	}

	public Invoice(UUID id, String name, double cost, float discountPercentage) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discountPercentage = discountPercentage;
		// TODO Auto-generated constructor stub
	}

	public double calculateTax() {
		return (this.cost * (GST / 100));
	}

	public double calculateDiscountAmount() {
		return (this.cost * (1 - (discountPercentage / 100)));
	}

	public double calculateTotalCost() {
		return (calculateDiscountAmount() + calculateTax());
	}

	public UUID getId() {
		return this.id;
	}
	public String getName() {
		return name;
		
	}
	public double getCost() {
		return cost;
	}
	
	public double getGST() {
		return GST;
	}
	
	public float getDiscountPercentage() {
		return discountPercentage;
	}

}
