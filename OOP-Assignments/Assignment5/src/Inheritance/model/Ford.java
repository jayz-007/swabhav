package Inheritance.model;

public class Ford extends Car {
	private int modelno = 123;
	private String brand = "Ford";

	public Ford(int wheels) {
		super(wheels);
	}

	public int getModelNo() {
		return modelno;
	}

	public String getbrand() {
		return brand;
	}

	public void makesNoise() {
		System.out.println("Engine sound high");
	}

}
