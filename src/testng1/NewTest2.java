package testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class NewTest2 {
WebDriver driver;
  @Test
  public void verifyPageTitle() {
  String title =driver.getTitle();
  System.out.println(title);
  Assert.assertEquals(title, "OrangeHRM - New Level of HR Management");
  
	  
	  
	  
  }
  @BeforeClass
  public void openBrowser() {
    driver=new ChromeDriver();  
	driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  
	  
  }

  @AfterClass
  public void closeBrowser() {
	 driver.close();
  }

}
