 package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumAutomation\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Dropdown.html");
		
		//1.Select the dropdown using index:
		
		WebElement dropDown1=driver.findElement(By.id("dropdown1"));   //normal webelement creation
		Select click=new Select(dropDown1);  //Specially seleinum create the select class for dropdown option.
		//(Select is class...so you create the object for particular web element.
		click.selectByIndex(1);
		
		//2.Select the dropdown using text;
		
		WebElement dropDown2=driver.findElement(By.name("dropdown2"));
		Select click2=new Select(dropDown2);
		click2.selectByVisibleText("Appium"); //visible text comment is used.
		
		//3.Select the dropdown using Value:
		
		WebElement dropDown3=driver.findElement(By.id("dropdown3"));
		Select click3=new Select(dropDown3);
		click3.selectByValue("3"); //Get the Value number from page inspect page.
		
		
		//4.Get the number of Dropdown options:
		
		WebElement options=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
		Select getNumber=new Select(options);  //Normal Select class Creation;
		List <WebElement> listOptions=getNumber.getOptions();   //getOptions is normally is List type.
		//(How to i find the the get options is list type?Move the mouse cursor to getoption comment its show the type).so we create the List methods
		int list=listOptions.size(); //we need the total number of dropmenu..in list interface using Size comment.size is int type.
		//So i declare the variable..size is int how to i find move the mouse cursor to size comment get the type.
		System.out.println(list);
		
		//5.Use Sendkeys to Select the Option.
		
		WebElement SendKeyOption=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		SendKeyOption.sendKeys("S");//Dont need type the full name..you type the sequnce of character.
		
		//6.Select the multiple Option
		
		WebElement multiple=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multitype=new Select(multiple);
		multitype.selectByIndex(1);
		multitype.selectByValue("2");
		multitype.selectByVisibleText("UFT/QTP");
		//multiple.sendKeys("L"); //If you give sendkeys comments..result is get the loadrunner only.Buz is not select option. 	
		String script="document.getElementById('username').value='Sudeer'";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(script);
		
		Thread.sleep(2000);
		
		//Clear value From username field
		String script1="document.getElementById('username').value=''";

	}

}
