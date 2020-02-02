package Pages;

import seleniumBase.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{

	public ViewLeadPage verify_Lead_Creation_is_success() {
		
		String text = driver.findElementById("viewLead_firstName_sp").getText();
	    System.out.println("Verify Lead creation is success to verify FirstName is divya: "+text);
	    return this;
	}
}
