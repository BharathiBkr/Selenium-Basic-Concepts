package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxMethods {

	public static void main(String[] args) {
		//Working with Text Boxes
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Edit.html");//go to website

		WebElement mailBox= driver.findElement(By.id("email"));
		mailBox.sendKeys("bharathiraj@gmail.com");//Type the mail in mail box using element type

		WebElement appendBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendBox.sendKeys("Text");//add the text to already added text.in Selenium override is not happen if you give the value inthe box already type text also is here.

		WebElement getText=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input"));
		String value=getText.getAttribute("value");//put the attribute name---get the attribute value..get value is string type so you store the value in one string element
		System.out.println(value);//get the value is printed in the box 

		WebElement clearBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearBox.clear(); //Clear the Value in the printed box

		WebElement disabled=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean type=disabled.isEnabled(); //If you give the return type like boolean  or string.Next step put the sys print out statement.
		System.out.println(type);


	}

}
