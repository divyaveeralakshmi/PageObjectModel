package seleniumBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectSpecificMethods {
public static ChromeDriver driver;
  @BeforeMethod
  public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
  		driver = new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.get("http://leaftaps.com/opentaps/");
  		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  		
  		System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void closeBrowser() {
	  driver.close();
	  System.out.println("AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite");
  }

}

