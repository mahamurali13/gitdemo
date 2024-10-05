package myselenium1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class locaters {

	public static void main(String[] args) throws InterruptedException {
		// creating a class
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.instagram.com");

		// driver.navigate().forward();
		// find element by name
		driver.findElement(By.name("username")).sendKeys("Checkbox");
		Thread.sleep(1000);
//driver.switchTo().newWindow(WindowType.TAB);

		// driver.navigate().to("https://www.flipkart.com/");
		// String pagetitle=driver.getTitle();
		// System.out.println(pagetitle);
		// Thread.sleep(1000);
		// driver.navigate().back();

		driver.navigate().refresh();
		driver.findElement(By.linkText("Sign up")).click();
		ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(window);
		driver.switchTo().window(window.get(1));
		System.out.println();

	}

}
