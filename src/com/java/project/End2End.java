package com.java.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//vinayak
public class End2End {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value ='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value ='MAA'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("The calender is disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.cssSelector("input[value='Search'")).click();
		driver.close();
	}

}
