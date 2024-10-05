package testsuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class SmokeTest1 {
	WebDriver driver;
	
  @Test()
  public void smokeTest() {
	  
	  
	  String title=driver.getTitle();
		 System.out.println(title);
		 Assert.assertEquals(title, "OrangeHRM - New Level of HR Management");
		 }
  
		 @Test
		  public void loginTest() {
		 driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("mahalakshmi");
		 }
		 
		 @Test
		  public void passwordTest() {
		 driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("9705585554");
		 }
		 
		 @Test
		  public void verifyTest() {
		 driver.findElement(By.xpath("//input[@type='Submit']")).click();
		  }
		 
			 

	  
	  
 
  
  
  @BeforeClass
  public void configClass() {
	   driver= new ChromeDriver();
	   driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
  }

  @AfterClass
  public void closeClass() {
	  driver.close();
  }

}
