package com.ziv.TestProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSeleniumChrome {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		// 告訴selenium driver的位置
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Testing Search ");
		element.submit();
		driver.quit();
	}

}
