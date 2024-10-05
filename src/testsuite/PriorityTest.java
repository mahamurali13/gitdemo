package testsuite;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class PriorityTest {
	WebDriver driver;

	  @Test (priority=0)
	  public void getTitle() {
		  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		 String title=driver.getTitle();
		 System.out.println(title);
	  }
	  
	  @Test(priority=1)
	  public void userName() {
		  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("mahalakshmi");
	  }
	  
	  @Test(priority=2)
	  public void passWord() {
		  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("9705585554");
	  }
	  
	  @Test(priority=3)
	  public void clickButton() {
		  driver.findElement(By.xpath("//input[@type='Submit']")).click();
	  }
	
  
  
  
  
  @BeforeClass
  public void configureWeb() {
	   driver=new ChromeDriver();
	  
  }

 
  @AfterClass
  public void closeClass() {
	  driver.close();
  }

}
