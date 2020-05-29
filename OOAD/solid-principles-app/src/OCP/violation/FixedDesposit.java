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

	private double calculateRate() {
		if (festivalType.equals(Festival.Diwali))
			return 0.08;
		if (festivalType.equals(Festival.Ramzan))
			return 0.09;
		if (festivalType.equals(Festival.Normal))
			return 0.07;
		return 0;

	}
	public double calculateSimpleInterest() {
		return((principle*calculateRate()*duration)/100);
	}

}
