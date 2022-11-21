package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SeleniumBasics\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
//		WebElement mouse=driver.findElement(By.xpath("//*[@id=\'nav-wrapper\']/ul/li[3]/a"));
//		Actions action=new Actions(driver);
//		action.moveToElement(mouse).build().perform();
//		List<WebElement> course=driver.findElements(By.xpath("//*[@id=\'nav-wrapper\']/ul/li[3]/ul/li"));
//		System.out.println(course.size());
//		Actions action1=new Actions(driver);
//		action1.click(course.get(2)).build().perform();
		
//		driver.get("https://mousetester.com/");
//		WebElement mouseCheck=driver.findElement(By.id("clickMe"));
//		Actions mouse=new Actions(driver);
//		mouse.moveToElement(mouseCheck).doubleClick().perform();
//		mouse.contextClick().perform();//Right Click of mouse.
//		
		
		
		

	}

}
