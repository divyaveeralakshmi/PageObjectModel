package Pages2;

import seleniumBase.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage enterCompanyName()
	{
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		return this;
	}
	
	public CreateLeadPage enterFirstName()
	{
		driver.findElementById("createLeadForm_firstName").sendKeys("Divya");
		return this;
	}
	
	public CreateLeadPage enterLastName()
	{
		driver.findElementById("createLeadForm_lastName").sendKeys("M");
		return this;
	}
		
	public ViewLeadPage clickCreateLeadButton()
	{
		driver.findElementByName("submitButton").click();
	    return new ViewLeadPage();
	}
}
