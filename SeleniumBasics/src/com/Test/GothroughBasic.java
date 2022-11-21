package com.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class GothroughBasic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\SeleniumBasics\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		//Text Box
		//		WebElement namebox=driver.findElement(By.id("j_idt88:name"));
		//		namebox.sendKeys("Bharathiraj");
		//		Thread.sleep(3000);
		//		WebElement appendbox=driver.findElement(By.id("j_idt88:j_idt91"));
		//		appendbox.sendKeys("India");
		//		Thread.sleep(3000);
		//		WebElement disablebox=driver.findElement(By.id("j_idt88:j_idt93"));
		//		boolean status=disablebox.isEnabled();
		//		System.out.println(status);
		//		Thread.sleep(3000);
		//		WebElement clearbox=driver.findElement(By.id("j_idt88:j_idt95"));
		//		clearbox.clear();
		//		Thread.sleep(3000);
		//		WebElement gettextbox=driver.findElement(By.id("j_idt88:j_idt97"));
		//		String text=gettextbox.getAttribute("value");
		//		System.out.println(text);
		//		WebElement typebox=driver.findElement(By.id("j_idt88:j_idt97"));
		//		typebox.sendKeys("About Yourself");
		//		WebElement errorbox=driver.findElement(By.id("j_idt106:thisform:age"));
		//		errorbox.sendKeys(""+Keys.ENTER);
		//		Thread.sleep(3000);
		//		WebElement errormsg=driver.findElement(By.id("j_idt106:thisform:j_idt110"));
		//		String errortext=errormsg.getText();
		//		System.err.println(errortext);

		//If the dropdown under UI/Button/Select Tag..using following procedure

		//	WebElement typebox=driver.findElement(By.id("j_idt106:auto-complete_input")); //get the input tag id for sendkeys.
		//	typebox.sendKeys("Bharathiraj");
		//	Thread.sleep(3000);
		//	typebox.sendKeys(Keys.ARROW_DOWN);
		//	typebox.sendKeys(Keys.ARROW_DOWN);
		//	typebox.sendKeys(Keys.ARROW_DOWN);
		//	typebox.sendKeys(Keys.ENTER);
		
		//Buttons
//		WebElement disabledbut=driver.findElement(By.id("j_idt88:j_idt92"));
//		System.out.println(disabledbut.isEnabled());
//		WebElement xyposition=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
//		Point value=xyposition.getLocation();
//		System.out.println(value.getX());
//		System.out.println(value.getY());
//		WebElement color=driver.findElement(By.id("j_idt88:j_idt96"));
//		System.out.println(color.getCssValue("background-color"));
//		WebElement sizebutton=driver.findElement(By.id("j_idt88:j_idt98"));
//		Dimension hwbutton=sizebutton.getSize();
//		System.out.println(hwbutton.height);
//		System.out.println(hwbutton.width);
//		WebElement colorchangebutton=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]/span"));
//		System.out.println(colorchangebutton.getCssValue("border-bottom-color"));
//		Thread.sleep(3000);
//		Actions action=new Actions(driver);
//		action.moveToElement(colorchangebutton).build().perform();
//		System.out.println(colorchangebutton.getCssValue("border-bottom-color"));
//		List<WebElement> countbutton=driver.findElements(By.xpath("//*[@id=\"j_idt88\"]/div/div[2]/div[4]/button"));
//		System.out.println(countbutton.size());
		
		
		//DropDown 
//		WebElement uiTool=driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
//		Select select=new Select(uiTool);
//		select.selectByIndex(1);
//		//If drop Down Under Label,Input,Select Tag Using First find the label element and click,
//		                        //and find input tag give the char then give enter using sendkeys
//		WebElement contry=driver.findElement(By.id("j_idt87:country_label"));
//		contry.click();
//		WebElement inputkey=driver.findElement(By.id("j_idt87:country_focus"));
//		inputkey.sendKeys("I");
//		inputkey.sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		WebElement state=driver.findElement(By.id("j_idt87:city_label"));
//		state.click();
//		WebElement stateinput=driver.findElement(By.id("j_idt87:city_focus"));
//		stateinput.sendKeys("c");
//		stateinput.sendKeys(Keys.ENTER);
//		WebElement course=driver.findElement(By.id("j_idt87:auto-complete_input"));
//		course.sendKeys("Sel");
//		course.sendKeys(Keys.ARROW_DOWN);
//		course.sendKeys(Keys.ENTER);
//		WebElement language=driver.findElement(By.id("j_idt87:lang_label"));
//		language.click();
//		WebElement langtext=driver.findElement(By.id("j_idt87:lang_focus"));
//		langtext.sendKeys("E");
//		langtext.sendKeys(Keys.ENTER);
		
		//Alets
		
//		WebElement alert1=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
//		alert1.click();
//		Alert alert=driver.switchTo().alert();
//		alert.accept();
//		WebElement alert2=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
//		alert2.click();
//		driver.switchTo().alert().accept();
//		WebElement alert3=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]/span[2]"));
//		alert3.click();
//		WebElement dimiss=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
//		dimiss.click();
//		WebElement button4=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]/span[2]"));
//		button4.click();
//		Thread.sleep(3000);
//		WebElement close=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a"));
//		close.click();
//		WebElement textalert=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]"));
//		textalert.click();
//		Alert alerttext=driver.switchTo().alert();
//		alerttext.sendKeys("Bharathiraj");
//		alerttext.accept();
//		WebElement delete=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt106\"]/span[2]"));
//		delete.click();
//		WebElement yesbutton=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt108\"]/span[2]"));
//		yesbutton.click();
//		WebElement last=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt111\"]/span[2]"));
//		last.click();
//		WebElement max=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt112\"]/div[1]/a[2]"));
//		max.click();
		
		//Radio Button
		
//		WebElement radio1=driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]"));
//		radio1.click();
//		WebElement unselectable=driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[1]/div/div[2]"));
//		unselectable.click();
//		Thread.sleep(3000);
//		unselectable.click();
//		WebElement chrome=driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[1]/div/div[2]"));
//		WebElement fire=driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[2]/div/div[2]"));
//		WebElement safari=driver.findElement(By.id("j_idt87:console2:2"));
//		WebElement edge=driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[4]/div/div[2]"));
//		System.out.println("Chrome is Selected its   "+chrome.isSelected());
//		System.out.println("Fire Fox is selected its  "+fire.isSelected());
//		System.out.println("Safari is selected its   "+safari.isSelected());
//		System.out.println("Edge is selected its    "+edge.isSelected());
		
		//CheckBox
		
//		WebElement toggle=driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]/div[2]"));
//		toggle.click();
//		WebElement disable=driver.findElement(By.id("j_idt87:j_idt102"));
//		System.out.println(disable.isSelected());
//		WebElement tri=driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]"));
//		tri.click();
//		Thread.sleep(1000);
//		tri.click();
//		Thread.sleep(1000);
//		tri.click();
//		WebElement multiple=driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/ul"));
//		multiple.click();
//		Thread.sleep(1000);
//		WebElement lonon=driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[2]/div/div[2]"));
//		lonon.click();
//		WebElement paris=driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[3]/div/div[2]"));
//		paris.click();
		
		
		
		
		
		
	
			}
			
			
			
			
		
			
		}
		

		
	


