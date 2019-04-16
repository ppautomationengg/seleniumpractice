package com.java.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).click();
		 Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount")).isSelected());
		// To print count of check boxes.
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox]")).size());
       //Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox]")).size(), 6);
       
       //To check if calender is enable or disable without using isEnabled() method.
       System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
       driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
       System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
       if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
    	   System.out.println("The calender is Enabled");
    	   Assert.assertTrue(true);
       }
       else {
    	   Assert.assertTrue(false);
       }
	}

}
