package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/"); //Open the given URL
		driver.manage().window().maximize(); //Maximize the Screen Size
		driver.quit();	//Close the Current URL
		
		

	}

}
