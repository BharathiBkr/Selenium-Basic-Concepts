package com.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumBasics\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		
		//1.Normal Alert Box:
		
		WebElement alertbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click(); //normal button method
		Alert alert=driver.switchTo().alert();  //Alert Interface special for Alert boxes
		alert.accept();
		
		//2.Confirm Box:
		
		WebElement confirmBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmBox.click();
		Alert confirm=driver.switchTo().alert();
		confirm.dismiss();
		
		//3.Promot Box:
		
		WebElement promotBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promotBox.click();
		Alert promot=driver.switchTo().alert();
		promot.sendKeys("Government College Of Engineering");
		promot.accept();

	}

}
