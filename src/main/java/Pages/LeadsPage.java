package Pages;

import seleniumBase.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods{

	public CreateLeadPage clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
		
}
