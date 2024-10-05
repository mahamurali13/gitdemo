package testsuite;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class PropertyTest {
	Properties config;
	Properties OR;
	WebDriver driver;
	 
  @Test
  public void testProp() throws InterruptedException {
	  driver.get(config.getProperty("TestSiteName"));
	  
	  driver.findElement(By.xpath(OR.getProperty("Login_username"))).sendKeys("mahalakshmi");
	  driver.findElement(By.xpath(OR.getProperty("Login_password"))).sendKeys("970558554");
	  Thread.sleep(5000);
	  
	  
	  
	  
	  
	  
  }
  @BeforeClass
  public void properTest() throws IOException {
	  Properties config=new Properties();
	  FileInputStream fis= new FileInputStream("C:\\mahasworkprojects\\Myselenium1\\src\\Properties\\config.Properties");
	  config.load(fis);
	  Properties OR=new Properties();
	  FileInputStream obj=new FileInputStream("C:\\mahasworkprojects\\Myselenium1\\src\\Properties\\ObjectRepositery.Properties");
	  OR.load(obj);
	  if(config.getProperty("browser").equals("Firefox")){
	   WebDriver driver=new FirefoxDriver();
	  }
	  else {
	  
		  System.out.println("property not found");
	  }
	  }
  @AfterClass
  public void closeClass() {
	  driver.close();
  }
}

