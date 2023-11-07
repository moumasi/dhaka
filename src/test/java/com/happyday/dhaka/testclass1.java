package com.happyday.dhaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class testclass1 {
	@Test
	public void red() {
		System.setProperty("webDriver.chrome.driver", "C:\\chormeDriver\\chrome-win64\\chrome.exe");
		ChromeOptions holl= new ChromeOptions();
		holl.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		WebElement y= driver.findElement(By.id("search"));
		
		y.sendKeys("Baby wipes");
	}

}
