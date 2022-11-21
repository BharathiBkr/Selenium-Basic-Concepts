package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton { //Radio Button means select the one button

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		
		//1.Click the one radioButton your wise:
		
		WebElement radio1=driver.findElement(By.id("no"));
		radio1.click();
		
		//2.Find the Default Selected Radio Button:
		
		WebElement button1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[1]"));
		WebElement button2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
		boolean uncheckedBox=button1.isSelected();
		boolean checkedBox=button2.isSelected();
		System.out.println(uncheckedBox);
		System.out.println(checkedBox);
		
		//3.Click the one box without already selected box:
		
		WebElement radio3=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[3]"));
		radio3.click();

	}

}
