 package com.seleniumPractice.testScripts;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.FluentWait;

public class FirstAutomation {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//WebDriverManager.Chromedriver.setup();
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get("http://www.google.com");
		 
		
	}

}
