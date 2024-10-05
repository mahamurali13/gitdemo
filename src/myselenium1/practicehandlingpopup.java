package myselenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome .ChromeDriver;

public class practicehandlingpopup {

	public static void main(String[] args) throws InterruptedException {
	//handling web based alerts
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("mngr588033");
		driver.findElement(By.name("password")).sendKeys("gymUsUr");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
		//identify alert box by using switchto
		Alert pop=driver.switchTo().alert();
		//get text of alert box
		String alerttext = pop.getText();
		System.out.println(alerttext);
		if(alerttext.equals(
				"You Have Succesfully Logged Out")) {
			System.out.println("print logout success");
		}
		else
		{System.out.println("print nothing");
			
		}
		Thread.sleep(2000);
		pop.accept();
		
		
		
		
	
	}}

