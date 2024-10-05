package myselenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class loginorangehrm {

	public int addition(int a, int b, int c) {
		int result = a + b + c;
		return result;

	}

	public int substraction(int a, int b, int c) {
		int result = a - b - c;
		return result;
	}

	public static void main(String[] args) throws InterruptedException {
		

		loginorangehrm math = new loginorangehrm();
		int add = math.addition(9, 9, 9);
		int sub = math.substraction(100, 25, 14);
		System.out.println(add);
		System.out.println(sub);

//		test case 1 set property

		WebDriver driver = new ChromeDriver();
		// navigate current page title
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		// get the title to console
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		// verify page title
		if (pagetitle.equals("OrangeHRM - New Level of HR Management")) {
			System.out.println(" title of page verifeied successfully");
		} else {
			System.out.println(" title of page verifeied  not successfully");
		}
		// maximize the PAGE
		driver.manage().window().maximize();
		// LOGIN TO PAGE
		driver.findElement(By.name("txtUserName")).sendKeys("mahalakshmi");
		// test case5 enter pass sword
		driver.findElement(By.name("txtPassword")).sendKeys("9705585554");
		// test case 6 enter click to login button
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		// test case 7 verify welcome mahalakshmi element on web page

		String text = driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText();
		System.out.println(text);

		if (text.equals("Welcome mahalakshmi")) {
			System.out.println("welcome mahalakshmi");
		} else {
			System.out.println("print nothing");
		}
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

		driver.close();

	}
}
