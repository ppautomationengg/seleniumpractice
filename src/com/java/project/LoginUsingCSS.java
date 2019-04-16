package com.java.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingCSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//login for facebook
	/*	driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Myowncss");//css by syntax tagname[attribute='value']
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Hi");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		driver.close();*/
		//Login for walmart
		driver.get("https://www.walmart.com/account/login");
		driver.findElement(By.cssSelector("input#email")).sendKeys("reshma.v.pawar@gmail.com");  //css by syntax tagename#id
		driver.findElement(By.cssSelector("input#password")).sendKeys("helo");
		driver.findElement(By.xpath("//*[@id='sign-in-form']/button[1]")).click();
		driver.close();
	    System.out.println("done");
		
		/* one more syntax for Css tagename.classname*/

	}

}
