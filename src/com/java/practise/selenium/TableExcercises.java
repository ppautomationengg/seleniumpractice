package com.java.practise.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TableExcercises {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vipransh\\Desktop\\Vips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22410/mi-vs-csk-15th-match-indian-premier-league-2019");
		driver.manage().window().maximize();
		int sum =0;
		 WebElement table= driver.findElement(By.cssSelector("div[class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']"));
		 int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		 int count =  table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		 for(int i =0; i<count-2;i++) {
			 System.out.println(table.findElements(By.cssSelector("div[class ='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		     String value=table.findElements(By.cssSelector("div[class ='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		   int valueInteger = Integer.valueOf(value);
		    sum=sum+valueInteger;
			  }
		 System.out.println(sum);
		/*String extra=driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-60'][contains(text(),'Extras')]/following-sibling::div")).getText();
		int extraValue = Integer.parseInt(extra);
		int totalValue = sum+extraValue;
		System.out.println(totalValue);
		String actualTotal =driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int actualTotalValue =Integer.parseInt(actualTotal);
		if(actualTotalValue==totalValue) {
			System.out.println("Count Mataches");
		}else
		{
			System.out.println("Count fails");
		}*/
		
		
	}

}
