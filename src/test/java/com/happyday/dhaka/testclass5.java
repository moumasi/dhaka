package com.happyday.dhaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class testclass5 {
	@Test
	public void boy() {
		System.setProperty("WebDriver.edge.driver", "C:\\edgeDriver\\msedgedriver.exe");
		ChromeOptions naz= new ChromeOptions();
		naz.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.apple.com/");
		driver.manage().window().maximize();
		WebElement t= driver.findElement(By.id("globalnav-menubutton-link-search"));
		t.sendKeys("iphone 11 pro");
		
	}

}
