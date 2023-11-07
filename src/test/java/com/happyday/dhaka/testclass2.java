package com.happyday.dhaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testclass2 {
	
	@Test
	public void naz() {
		System.setProperty("webDriver.edge.driver", "C:\\edgeDriver\\msedgedriver.exe");
		EdgeOptions air= new EdgeOptions();
		air.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		WebElement a= driver.findElement(By.id("mh-search-input"));
		a.sendKeys("Monitor");
		
		
		
		
		
	}

}
