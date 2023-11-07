package com.happyday.dhaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class testclass4 {
	
	@Test
	public void girl() throws Exception {
		System.setProperty("WebDriver.chrome.driver", "C:\\chormeDriver\\chrome-win64\\chrome.exe");
		ChromeOptions TH= new ChromeOptions();
		TH.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
	
		
		Thread.sleep(10000);
		driver.close();
		
	}

}
