package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {   //Check Box means select the multiple option

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\SeleniumBasics\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();

		//1.Select one Box:

		WebElement select1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		select1.click();

		//2.Confirm the box is selected:

		WebElement check=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
		boolean confirm=check.isSelected();
		System.out.println(confirm);

		//3.Deselect the selected box with check:

		WebElement checkBox1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		if (checkBox1.isSelected()) {  //if checkbox1 is selected this condition is true.so click the box(its menas deselect )
			checkBox1.click();
		}
		WebElement checkBox2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		if (checkBox2.isSelected()) {
			checkBox2.click();
		}

	}

}
