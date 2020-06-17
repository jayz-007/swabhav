package DIP.solution;

public class TaxCalculator {
	private ILogType log;

	public TaxCalculator(ILogType log) {
		this.log = log;
	}

	public int calculateTax(int amt, int rate) {
		try {
			int result = amt / rate;
			return result;
		} catch (Exception e) {
			log.log(e);
			return -1;
			

		}
	}

}
