
public class TestOOAD {
	public static void main(String args[]) {
		Senior jay = new Senior(101, "jay", "developer", 3);
		Senior vinit = new Senior(102, "vinit", "tester", 3);
		Senior pawan = new Senior(103, "pawan", "manager", 4);

		PartnerCompany aurionPro = new PartnerCompany(101, 46, "aurionPro");
		aurionPro.addSenior(vinit);
		aurionPro.addSenior(jay);

		PartnerCompany techlabs = new PartnerCompany(102, 54, "techlabs");
		techlabs.addSenior(pawan);

		Company swahav = new Company(101, 23, "swabhav");
		swahav.addPartnerCompany(aurionPro);
		swahav.addPartnerCompany(aurionPro);
		swahav.addSenior(jay);
		
		
		printInfo(swahav);
		
		printInfo(aurionPro);
		printInfo(techlabs);

	}

	public static void printInfo(Company company) {
		System.out.println("Company details of " + company.getName());
		System.out.println(
				"Name " + company.getName() + " Id " + company.getId() + " totalEmp " + company.getTotalEmployees());
		System.out.println("Partner Details");
		for (PartnerCompany partnerComapny : company.getPartnerCompanies()) {
			System.out.println("Id " + partnerComapny.getId() + " name " + partnerComapny.getName() + " total Emp"
					+ partnerComapny.getTotalEmployees() + " seniors in company " + partnerComapny.getSenircount());

		}

		System.out.println("Senior Info ");
		for (Senior senior : company.getSeniors()) {
			printInfo(senior);
		}
		System.out.println();
	}

	public static void printInfo(PartnerCompany partnerComapny) {
		System.out.println("Id " + partnerComapny.getId() + " name " + partnerComapny.getName() + " total Emp"
				+ partnerComapny.getTotalEmployees() + " seniors in company " + partnerComapny.getSenircount());
		System.out.println("Senior Details");
		for (Senior senior : partnerComapny.getSeniors()) {
			printInfo(senior);
		}
		System.out.println();

	}

	public static void printInfo(Senior senior) {
		System.out.println("Name " + senior.getName() + " id " + senior.getId() + " Designation "
				+ senior.getDesignation() + " yearOfExp " + senior.getYearOfExp());
	}


}
