package com.java.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//vinayak
public class DropdownDynamicWithoutIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 driver.findElement(By.xpath("//a[@value ='BLR']")).click();
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("(//a[@value ='MAA'])[2]")).click();
		 driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value ='MAA']")).click();
		 //driver.close();
		 
	}

}
