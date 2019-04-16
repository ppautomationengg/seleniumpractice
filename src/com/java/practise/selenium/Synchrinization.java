package com.java.practise.selenium;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//vinayak
public class Synchrinization {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.alaskaair.com/hotels/mp/home/en/?t=1553193764479&utm_source=alaska&utm_medium=partner-page&utm_campaign=alaska-globalnav-bookhotels-Q12019-home-tr");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("Location")).clear();
		driver.findElement(By.name("Location")).sendKeys("NYC");
		driver.findElement(By.name("Location")).sendKeys(Keys.TAB);
	
		//driver.findElement(By.xpath("//input[@class= 'wl-input-base.range-picker__input ng-pristine.ng-valid.ng-isolate-scope.ng-not-empty.ng-valid-required.ng-valid-date.ng-touched']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("   //span[contains(text(),'Holiday Inn Manhattan Financial District')]")).click();

	}

}
