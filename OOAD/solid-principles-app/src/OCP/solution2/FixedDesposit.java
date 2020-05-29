package OCP.solution2;

import OCP.solution1.Festival;
import OCP.solution1.ISimpleInterest;

public class FixedDesposit implements ISimpleInterest {
	private int accno;
	private String name;
	private double principle;
	private int duration;
	private IFestivalRate festivalRate;

	public FixedDesposit(int accno, String name, double principle, int duration, IFestivalRate festivalRate) {
		this.accno = accno;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festivalRate = festivalRate;

	}

	@Override
	public double calculateSimpleInterest() {
		return ((principle * festivalRate.getRate() * duration) / 100);
	}

}
