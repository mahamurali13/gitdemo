package myselenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//navigate url
		driver.get("https://apps.fas.usda.gov/esrquery/esrq.aspx");
		//get  page title
		String pagetitle =driver.getTitle();
		System.out.println(pagetitle);
		//identify  listbox 
		WebElement  listbox=driver.findElement(By.id("ctl00_MainContent_lbCountry"));
		//select multible values in list box
		Select multilistbox=new Select(listbox);
		multilistbox.selectByIndex(5);
		multilistbox.selectByVisibleText("BELIZE");
		if(multilistbox.isMultiple()) {
			System.out.println("multi selection allowed");
		}
		else
		{
		System.out.println("multi not allowed");	
		}
		
		List<WebElement> allcountries=listbox.findElements(By.tagName("option"));
		System.out.println(allcountries.size());
		for(int i=0;i<allcountries.size();i++) {
			System.out.println(allcountries.get(i).getText());
		//verify multiple text
		if(allcountries.get(i).isDisplayed()) {
			System.out.println("multiple selected");
		}
		else { 
			System.out.println("not verified");
		}
		
        }
	    }
	}




	
