package com.java.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalmartLogin {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com/account/login");
		driver.findElement(By.id("email")).sendKeys("ddfgfg");
		driver.findElement(By.name("password")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'sign-in-form\']/div[1]/label/span[1]")).getText());
		driver.findElement(By.id("email")).clear();
		//driver.findElement(By.name("password")).clear();
		driver.findElement(By.id("email")).sendKeys("reshma.v.pawar@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sfsdgdfg");
		driver.findElement(By.xpath("//*[@id='sign-in-form']/button[1]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(driver.findElement(By.id("global-error")).getText());
		driver.close();
	}

}
