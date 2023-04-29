package com.seleniumPractice.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//tag #id
		// driver.findElement(By.cssSelector("#email")).sendKeys("sssss");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("sssss");
		//tag.class
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("sssss");
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("sssss");
		//tag & attribute
		// driver.findElement(By.cssSelector("input[name=email]")).sendKeys("sssss");
		 //tag,class&attribute
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("sssss");
		driver.findElement(By.cssSelector("input[data-testid=royal_pass]")).sendKeys("sssss");
		
		
	}

}
