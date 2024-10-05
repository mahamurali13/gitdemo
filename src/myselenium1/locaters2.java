package myselenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaters2 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://github.com/login");
	String page =driver.getTitle();
	System.out.println(page);
	//locater id
	driver.findElement(By.id("login_field")).sendKeys("mahalakshmi");
	//by name
	driver.findElement(By.name("password")).sendKeys("12345");
	//class name
	driver.findElement(By.className("flash-container"));
	//link text
	driver.findElement(By.linkText("Sign in with a passkey"));
	//partial link text
	driver.findElement(By.partialLinkText("Create"));
	//css selector
	driver.findElement(By.cssSelector("#forgot-password"));
	//xpath
	driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[13]")).click();
	}

}
