package OCP.violation;

public enum Festival {
	Normal, Diwali, Ramzan;

	@Override
	public String toString() {
		switch (this) {
		case Normal:
			return "Normal";
		case Diwali:
			return "Diwali";
		case Ramzan:
			return "Ramzan";
		default:
			return null;
		}

	}
}
