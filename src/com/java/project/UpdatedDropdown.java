package com.java.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("divpaxinfo")).click();
		 Thread.sleep(2000L);
		 System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
		 int i = 1;
		 while (i<5)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click();
			 i++;
		 }
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
		 driver.close();
	}
}
		 
		