package com.java.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("travelers");
		 driver.manage().window().maximize();
		 Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		 s.selectByValue("USD");
		 s.selectByIndex(2);
		 s.selectByVisibleText("USD");
		 
		 
		 
		// driver.close();
		 System.out.println("The test is passed");
		 

	}

}
