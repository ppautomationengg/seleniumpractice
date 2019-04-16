package com.java.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("reshma.v.pawar@gmail.com");
		/*driver.findElement(By.id("pass")).sendKeys("lovevipransh");
		driver.findElement(By.id("u_0_2")).click();*/
		//driver.findElement(By.name("pass")).sendKeys("lovevipransh");
		/*driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.xpath("//*[@id=\"identify_email\"]")).sendKeys("reshma.v.pawar@gmail.com");
		driver.findElement(By.name("did_submit")).click();*/
		driver.findElement(By.cssSelector("#email")).sendKeys("reshma.v.pawar@gmail.com");	
		driver.close();


	}

}
