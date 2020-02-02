package Pages2;

import seleniumBase.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUserName()
	{
		driver.findElementById("username").sendKeys("DemoSalesManager");
  		return this;
	}
	
	public LoginPage enterPassword()
	{
		driver.findElementById("password").sendKeys("crmsfa");
  		return this;
	}
	
	public HomePage clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		/*HomePage obj = new HomePage();
		 return obj;
		 */
		return new HomePage();
	}
	
}
