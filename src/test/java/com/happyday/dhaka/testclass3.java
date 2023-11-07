package com.happyday.dhaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class testclass3 {
	
	@Test
	public void mom() {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\chormeDriver\\chrome-win64\\chrome.exe");
		ChromeOptions dev= new ChromeOptions();
		dev.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		WebElement t= driver.findElement(By.id("header-input-search"));
		t.sendKeys("Bags");
		
	}

}
