package DIP.violation;

public class TaxCalculator {
	private LogType log;

	public TaxCalculator(LogType log) {
		this.log = log;
	}

	public int calculateTax(int amt, int rate) {
		try {
			int result = amt / rate;
			return result;
		} catch (Exception e) {
			if(log.equals(LogType.JSON))
				new JSONLogger().Log(e);
			if(log.equals(LogType.XML))
				new XMLLogger().Log(e);
			if(log.equals(LogType.Text))
				new TextLogger().Log(e);
			return -1;

		}
	}

}
