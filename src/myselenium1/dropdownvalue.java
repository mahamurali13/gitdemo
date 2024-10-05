
package myselenium1;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownvalue {

	public static void method(WebDriver driver, WebElement element) {
		return;
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("mahalakshmi");
		driver.findElement(By.name("txtPassword")).sendKeys("9705585554");
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		// handling frame with switch to method
		driver.switchTo().frame(driver.findElement(By.id("rightMenu")));

		// identifying drop down
		WebElement dropdown = driver.findElement(By.name("loc_code"));
		List<WebElement> droplist = dropdown.findElements(By.tagName("option"));
		System.out.println(droplist.size());
		for (int i = 0; i < droplist.size(); i++) {
			System.out.println(droplist.get(i).getText());
		}

		// select the drop down value
		Select emp = new Select(dropdown);
		emp.selectByIndex(2);
		emp.selectByVisibleText("Emp. First Name");
		emp.selectByValue("1");
		Thread.sleep(2000);
		// verifying selected drop down value
		// emp.
		String selectedvalue = emp.getFirstSelectedOption().getText();
		System.out.println(selectedvalue);
		if (selectedvalue.equals("Emp. First Name")) {
			System.out.println("selected value verified successfully");
		} else {
			System.out.println("not succeful");
		}
		Select emp1 = new Select(dropdown);
		emp1.selectByVisibleText("Emp. ID");
		Thread.sleep(3000);
		String selectedvalue1 = emp1.getFirstSelectedOption().getText();
		System.out.println(selectedvalue1);
		if (selectedvalue1.equals("Emp. ID")) {
			System.out.println("id verifed successfully");
		}

		else {
			System.out.println("id not successfull");
		}
		driver.switchTo().defaultContent();

	}

}
