package myselenium1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// how to take screenshot
		/*
		 * manual steps >create screenshot location take screenshot save the screen shot
		 * to desired location
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/master.php");
		driver.findElement(By.name("username")).sendKeys("kosmik");
		driver.findElement(By.name("password")).sendKeys("kosmik");
		File desiredloc = new File("C:\\Checkbox pics\\Screenshothealth//img.jpg");

		File copy_screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(copy_screenshot, desiredloc);
		System.out.println("screenshot taken");

	}

}
