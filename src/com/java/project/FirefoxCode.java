package com.java.project;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https:\\www.google.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
