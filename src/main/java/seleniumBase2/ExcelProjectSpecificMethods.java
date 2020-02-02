package seleniumBase2;

    import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;

	import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Parameters;

import utils.ReadExcel;

import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.AfterSuite;

	public class ExcelProjectSpecificMethods {
		
			public static ChromeDriver driver;
			public String excelFileName;
		@Parameters({"url","uName","password"})
		@BeforeMethod
		  public void LaunchBrowser(String url) {
			//System.out.println("@Parameters");
			
			  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver=new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				System.out.println("@BeforeMethod");
		  }
		  
		@AfterMethod
		  public void BrowserClose() {
			System.out.println("@AfterMethod");
			  driver.close();
		  }


		  @BeforeClass
		  public void beforeClass() {
			  System.out.println("@BeforeClass");
		  }

		  @AfterClass
		  public void afterClass() {
			  System.out.println("@AfterClass");
		  }

		  

		  @AfterTest
		  public void afterTest() {
			  System.out.println("@AfterTest");
		  }

		  @BeforeSuite
		  public void beforeSuite() {
			  System.out.println("@BeforeSuite");
		  }

		  @AfterSuite
		  public void afterSuite() {
			  System.out.println("@AfterSuite");
		  }

	@DataProvider(name="fetchdata")
		  public String[][] SendData() throws IOException {
		  	 
		  	
		  	ReadExcel excel=new ReadExcel();
		  	String[][] data=excel.readExcel(excelFileName);
		  	  
		  	  	  
		  	  return data;
		  	  
		  	  }






	}




