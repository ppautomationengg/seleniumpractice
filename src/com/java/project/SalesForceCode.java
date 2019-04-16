package com.java.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("wqrwefdg");
		driver.findElement(By.id("password")).sendKeys("safsfsd");
		driver.findElement(By.name("Login")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		driver.close();

}
}
