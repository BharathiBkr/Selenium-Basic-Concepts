package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SeleniumBasics\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement login=driver.findElement(By.name("email"));
		login.sendKeys("9551805113");//get the name "email" in inspect the link...Send keys is used to put the Value on the box
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("bkrappa1"+Keys.ENTER);//Same as before line..last enter key is used to tap the enter key
		//name,id class values are get from inspect box
		//Relative XPath Syntax-//Tag name[@Attribute Name='Attribute Value']	
		driver.manage().window().maximize();
		int name=20;
		System.out.println("//td[normalize-space()="+"\""+name+"\""+"]//following::td[1]");
		
	}


}
