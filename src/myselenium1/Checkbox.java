package myselenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Checkbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		// check multiple checkbox
		/*
		 * WebElement checkbox1 =driver.findElement(By.id("vfb-6-0"));
		 * checkbox1.click(); if (checkbox1.isSelected()) {
		 * System.out.println("checkbox1 selected"); } else {
		 * System.out.println("not selected"); }
		 */

		// checkbox 2
		List<WebElement> multicheck = driver.findElements(By.tagName("input"));
		System.out.println(multicheck.size());
		for (int i = 0; i <= multicheck.size(); i++) {
			multicheck.get(i).click();

			// verify multi check box
			if (multicheck.get(i).isSelected()) {
				System.out.println("check box completed");
			} else {
				System.out.println("check box not completed");
			}

		}

	}
}
