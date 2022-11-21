package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedtext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.navigate().to("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("chithambarapuram"+Keys.ENTER);
		driver.findElement(By.linkText("Chithambarapuram Village - Onefivenine.com")); //not completed
		

	}

}
