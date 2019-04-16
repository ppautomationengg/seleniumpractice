package com.java.practise.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
                     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://qaclickacademy.com/practice.php");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				System.out.println(driver.findElements(By.tagName("a")).size());
				WebElement footerDriver = driver.findElement(By.id("gf-BIG"));// limiting WebDriver scope
				System.out.println(footerDriver.findElements(By.tagName("a")).size());
				WebElement coloumnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
				System.out.println(coloumnDriver.findElements(By.tagName("a")).size());
				for (int i = 0; i < coloumnDriver.findElements(By.tagName("a")).size(); i++) {
					String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
					coloumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
					try {
						Thread.sleep(50000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				    Set<String> abc = driver.getWindowHandles();
					java.util.Iterator<String> it =  abc.iterator();
					while(it.hasNext())
					{
						driver.switchTo().window(it.next());
						System.out.println(driver.getTitle());
					}
					
				

				}

		

}


