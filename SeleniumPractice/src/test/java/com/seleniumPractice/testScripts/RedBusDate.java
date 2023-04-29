package com.seleniumPractice.testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusDate {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		String month = "Oct 2023";
		String day ="15";
		driver.findElement(By.xpath("//label[@for='onward_cal']")).click();
		while(true) {
			String text = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		if(text.equals(month)) 
		{  
		break;
		}
		else
		{
			
			driver.findElement(By.xpath("//td[@class='next']/child::button")).click();
		}
	}
		
		List<WebElement> allDates=driver.findElements(By.xpath("//tr[@class='rb-monthHeader']/following-sibling::tr[2]/following::td"));
		
		for(WebElement date:allDates)
			{
				if(date.getText().equals(day))
					{
						date.click();
						break;
					}
			}
		
	}
}
