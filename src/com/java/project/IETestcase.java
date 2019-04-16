package com.java.project;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETestcase {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https:\\www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
