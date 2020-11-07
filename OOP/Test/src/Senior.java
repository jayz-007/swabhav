
public class Senior {
	private int id;
	public String name;
	private String designation;
	private int yearOfExp;

	public Senior(int id, String name, String designation, int yearOfExp) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.yearOfExp = yearOfExp;

	}

	public int getId() {
		return id;
	}

	public int getYearOfExp() {
		return yearOfExp;
	}

	public String getDesignation() {
		return designation;
	}

	public String getName() {
		return name;
	}

}
