package com.seleniumPractice.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[@class=\"col-12 text-center\"]/a/img")).click();
		String PName = driver.findElement(By.xpath("//a[text()='iPhone']")).getText();
		System.out.println(PName);
		//driver.close();
	}

}