package com.techlabs.model.test;

import java.text.ParseException;
import java.util.Iterator;

import com.techlabs.model.Organization;
import com.techlabs.model.Partner;
import com.techlabs.model.Talent;

public class Program {
	public static void main(String args[]) throws ParseException{
		Organization swabhav = new Organization("c81d4e2e-bcf2-11e6-869b-7df92533d2db", "swabhav", "12/25/1996");

		Partner aurionPro = new Partner(23, "Aurion Pro", 23445000, 50);
		Partner microsoft = new Partner(22, "Microsoft", 32345000, 500);
		Partner google = new Partner(21, "Google", 82745000, 1000);

		swabhav.addPartner(aurionPro);
		swabhav.addPartner(google);
		swabhav.addPartner(microsoft);

		Talent jay = new Talent(11, "Jay", 8.0f, null, "Java");
		Talent vinit = new Talent(12, "Vinit", 9.0f, google, ".Net");
		
		swabhav.addTalent(jay);
		swabhav.addTalent(vinit);
		
		
				

		printInfo(swabhav);
	}

	public static void printInfo(Organization organization){
		System.out.println("Organization details are :");
		System.out.println("Id is :" + organization.getId() + " Name is: " + organization.getName()
				+ " Registration date is : " + organization.getRegistrationDate());

		System.out.println("Partner details are :");

		for (Iterator<Partner> p = organization.getPArtners(); p.hasNext();) {
			Partner partner = p.next();
			System.out.println(
					"Partner id is :" + partner.getId() + " Partner name is :" + partner.getName() + " Turn over is "
							+ partner.getCompanyTurnOver() + " Strength is : " + partner.getCompanyStrength());

		}

		System.out.println("Talent Details are :");
		for (Iterator<Talent> t = organization.getTalents(); t.hasNext();) {
			Talent talent = t.next();
			System.out.println("Talent id is: " + talent.getId() + " Talent name is: " + talent.getName()
					+ " Cgpa is :" + talent.getCgpa() + " Talent associated to partner :"
					+ talent.getPartner().getName() + " techstack is: " + talent.getTechStack());
		}
	}

}
