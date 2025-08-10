package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
	public void dragAndDropTest() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		WebElement source=driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement target=driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
		
		Actions act=new Actions(driver);
		act.contextClick(source);
		act.dragAndDrop(source, target).perform();
		String text=target.getText();
		Assert.assertEquals(text, "Dropped!");

		}
	
}

