/*package testng1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Dropdowncompare1 {

	WebDriver driver;

	@Test

	public void dropDownsize() throws IOException {
		driver.findElement(By.name("username")).sendKeys("kosmik");
		driver.findElement(By.name("password")).sendKeys("kosmik");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.className("expandable")).click();

		// IDENTIFY DROP DOWN
		WebElement dropdown = driver.findElement(By.name("PAT_IDENTITY"));
		List<WebElement> dropvalue = dropdown.findElements(By.tagName("option"));
		System.out.println(dropvalue.size());
		// ENTERXL VALUES
		FileInputStream file = new FileInputStream("C:\\\\xlxs files\\\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("dropdownvalue");
		int totalrows = sheet.getLastRowNum() + 1;
		System.out.println("Excel size" + totalrows);
		// create arraylist object for excell
		ArrayList<String> Exelval = new ArrayList<String>();
		for (int i = 0; i < totalrows; i++) {
			Exelval.add(sheet.getRow(0).getCell(0).getStringCellValue());
		}
		// creat arraylist for dropdown
		ArrayList<String> dv = new ArrayList<String>();
		for (int j = 0; j <= dropvalue.size(); j++) {
			dv.add(dropvalue.get(j).getText());
		}
		if (Exelval.equals(dropvalue.size())) {
			// to read excel values
			for (int k = 0; 0 <= totalrows; k++) {
				// read the drop down values
				for (int i = 0; 0 <= dropvalue.size(); i++) {
					if (Exelval.get(k).equals(dv.get(i))) {
						System.out.println(Exelval.get(i) + "match with dropdown");
					}

					else {
						System.out.println("not matched");
					}
				}
				
					
				}
			}
		}

	

	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/master.php");

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}*/
