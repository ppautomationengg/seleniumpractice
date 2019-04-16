package com.java.practise.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(" //input[@id='travel_date']")).click();
		
		while(!driver.findElement(By.xpath("//html[1]/body[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/th[2]")).getText().contains("May")) {
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'»')]")).click();
		}
		List<WebElement> date = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();
		for (int i = 0; i <= count-1; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equals("22")) {
				driver.findElements(By.className("day")).get(i).click();
				break;

			}
		}
	}

}
