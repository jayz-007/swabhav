import java.util.ArrayList;
import java.util.List;

public  abstract class CompanyAbstract {
	private int id;
	private double totalEmployee;
	private String name;
	private List<Senior> listOfSeniors = new ArrayList<Senior>();
	private int seniorCount;

	 public CompanyAbstract(int id,double totalEmployees,String name) {
		// TODO Auto-generated constructor stub
	this.id=id;
	this.totalEmployee = totalEmployees;
	this.name=name;
	}

	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}

	public double getTotalEmployees() {
		return totalEmployee;
	}

	public List<Senior> getSeniors(){
		return listOfSeniors;
	}
	
	public void addSenior(Senior senior) {
		listOfSeniors.add(senior);
		seniorCount++;
	}
	
	public int getSenircount() {
		return seniorCount;
	}

}
