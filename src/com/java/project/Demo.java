
package com.java.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");// Hit URL 
		System.out.println(driver.getTitle());//To Validate page title is correct
		System.out.println(driver.getCurrentUrl());//Validate if u landed on correct page.
	//	System.out.println(driver.getPageSource());//Print page source.
		/*driver.get("https://www.yahoo.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();*/
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.findElement(By.className("gb_P")).click();
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"gb_70\"]")).click();
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
