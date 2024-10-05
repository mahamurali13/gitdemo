package testng1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class accessxlsx {
	WebDriver driver;

	@Test
	public void loginWithXlsx() throws IOException {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "OrangeHRM - New Level of HR Management");
		// need to access xl file into eclipse
		FileInputStream acces = new FileInputStream("C:\\xlxs files\\New Microsoft Excel Worksheet.xlsx");
		// GET workbook from xlxs
		XSSFWorkbook wbook = new XSSFWorkbook(acces);
		// get the sheet from work book
		XSSFSheet sheet = wbook.getSheet("readdata");
		// read the data from sheet
		// read the username data and store into variable
		String username = sheet.getRow(1).getCell(0).getStringCellValue();
		// read the password from data and store into variable
		double password = sheet.getRow(1).getCell(1).getNumericCellValue();
		//String p = String.valueOf(password);

		// read eclipse data to selenium from work book

		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(String.valueOf(password));

	}

	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();

	}

}
