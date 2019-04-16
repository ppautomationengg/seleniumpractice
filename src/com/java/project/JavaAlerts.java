package com.java.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("/html[1]/body[1]/table[3]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[4]/form[1]/input[1]")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().accept();//accept =ok, done,positive approach
		// driver.switchTo().alert().dismiss();  Dissmiss= no, cancel, negative approach
		 //To enter text in alert box we use driver.switchto.alert().sendkeys("sdgdfg");
	}

}
