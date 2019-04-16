package com.java.practise.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
		System.out.println("Before Switching to child window");
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		java.util.Iterator<String> it = ids.iterator();
		String parentId = it.next();
		System.out.println(parentId);
		String childId = it.next();
		System.out.println(childId);

		driver.switchTo().window(childId);
		System.out.println("Before Switching to child window");
		Thread.sleep(5000);
        System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(@class,'bCzwPe YySNWc')]")).click();
		driver.switchTo().window(parentId);
		 System.out.println("Again Switching back to parent window");
		driver.findElement(By.xpath("//div[@class='IMH1vc lUHSR Hj2jlf']")).click();

	}

}
