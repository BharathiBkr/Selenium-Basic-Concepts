package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonType {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Button.html");
		//Homepage Button
		/*
		WebElement homePage=driver.findElement(By.id("home"));
		homePage.click();//Page return to homepage.
		*/
		//Find the Position of Buttom
		
		WebElement position=driver.findElement(By.id("position"));
		Point value=position.getLocation();
		int xValue=value.getX();
		int yValue=value.getY();
		System.out.println("X Value "+xValue+"  Y Value  "+yValue); //Get the X And Y Value in Int return Type
		
		//Find the Color of Button
		
		WebElement color=driver.findElement(By.id("color"));

		String model=color.getCssValue("background-color");
		System.out.println(model);  //Get the RGB Value in String Return Type
		
		//Find the Size of button.
		
		WebElement size=driver.findElement(By.id("size"));
		int height=size.getSize().getHeight();
		int width=size.getSize().getWidth();
		System.out.println("Height Size  "+height+"  Width Size  "+width);
		
		//Homepage Button
		
		WebElement homePage=driver.findElement(By.id("home"));
		homePage.click();  //Page return to homepage.
		driver.close();
			
	
	}

}
