package myselenium1;

 import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alertpop {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		/*
		 * open then application 
		 * //click on login button without entering user credentials
		 * //switch to alert
		 *  //get the text print the text
		 *  //text click on "ok"button*/
		         driver.findElement(By.name("Submit")).click();
	             Alert alert=driver.switchTo().alert();
	             String alerttext= alert.getText();
	             System.out.println(alerttext);
	             Thread.sleep(2000);
	             //click on alert button
	             alert.accept();
	             Thread.sleep(2000);
	             driver.close();

	}

		
	}


