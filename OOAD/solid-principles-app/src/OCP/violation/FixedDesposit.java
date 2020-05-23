package OCP.violation;

public class FixedDesposit {
	private int accno;
	private String name;
	private double principle;
	private int duration;
	private Festival festivalType;

	public FixedDesposit(int accno, String name, double principle, int duration, Festival festivalType) {
		this.accno = accno;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festivalType = festivalType;
	}

	private float calculateRate() {
		if (festivalType.toString().equals("Diwali"))
			return 0.08f;
		if (festivalType.toString().equals("Ramzan"))
			return 0.09f;
		if (festivalType.toString().equals("Normal"))
			return 0.07f;
		return 0;

	}
	public double calculateSimpleInterest() {
		return((principle*calculateRate()*duration)/100);
	}

}
