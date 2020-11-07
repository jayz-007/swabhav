import java.util.ArrayList;
import java.util.List;

public class Company extends CompanyAbstract {
	private List<PartnerCompany> listOfCompanyPartners = new ArrayList<PartnerCompany>();

	public Company(int id, double totalEmployees, String name) {
		super(id, totalEmployees, name);
		// TODO Auto-generated constructor stub
	}
	
	public List<PartnerCompany> getPartnerCompanies(){
		return listOfCompanyPartners;
	}
	
	public void addPartnerCompany(PartnerCompany partnerCompany) {
		listOfCompanyPartners.add(partnerCompany);
	}

	
}
