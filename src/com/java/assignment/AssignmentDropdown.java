package com.java.assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssignmentDropdown {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://qaclickacademy.com/practice.php");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id='autocomplete']")).click();
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("IND");
			Thread.sleep(5000);
		    driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		    System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value"));
	}

}
