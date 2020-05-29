package OCP.solution1;

import OCP.solution1.Festival;

public class FixedDesposit implements ISimpleInterest {
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
		if (festivalType.equals(Festival.Diwali))
			return 0.08f;
		if (festivalType.equals(Festival.Ramzan))
			return 0.09f;
		if (festivalType.equals(Festival.Normal))
			return 0.07f;
		return 0;

	}

	@Override
	public double calculateSimpleInterest() {
		return((principle*calculateRate()*duration)/100);
	}


}
