package testcases;

import org.testng.annotations.Test;

import Pages.CreateLeadPage;
import Pages.HomePage;
import Pages.LeadsPage;
import Pages.LoginPage;
import Pages.MyHomePage;
import Pages.ViewLeadPage;
import seleniumBase.ProjectSpecificMethods;

public class TC001_CreateLead extends ProjectSpecificMethods{
@Test
	public void runCreateLead()
	{
	/*LoginPage obj = new LoginPage();
	 * obj.enterUserName()
	 * obj.enterPassword()
	 * obj.clickLogin();
	 */
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin();
		
		new HomePage()
		.clickCRMSFA();
		
		new MyHomePage()
		.clickLeads();
		
		new LeadsPage()
		.clickCreateLead();
		
		new CreateLeadPage()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickCreateLeadButton();
		
		new ViewLeadPage()
		.verify_Lead_Creation_is_success();
	
	}
}
