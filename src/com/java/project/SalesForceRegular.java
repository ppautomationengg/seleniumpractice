package com.java.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceRegular {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.className("rediffmail-logo")).getText());*/
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("reshma.v.pawar@gmail.com");
		driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@name ='proceed']")).click();
	}
	

}
