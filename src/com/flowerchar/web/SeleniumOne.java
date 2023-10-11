package com.flowerchar.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
public class SeleniumOne {
	
	WebDriver driver;
	
	public void InitDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\something\\chromedriver\\118\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("http://www.imooc.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void GetElement() {
		driver.findElement(By.id("js-signin-btn")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("email")).sendKeys("19822636863");
		driver.findElement(By.className("js-loginPassword")).sendKeys("qh010119");
		WebElement NodeElement = driver.findElement(By.className("rlf-autoin"));
		NodeElement.findElement(By.tagName("input")).click();
		List<WebElement> ButtonElement =  driver.findElements(By.className("rlf-group"));
		ButtonElement.get(4).click();
		driver.findElement(By.linkText("Íü¼ÇÃÜÂë")).click();
		driver.findElement(By.partialLinkText("Óöµ½")).click();
		driver.findElement(By.xpath("//*[@id=\"signin\"]/div[3]/div[1]/span")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeleniumOne s = new SeleniumOne();
		s.InitDriver();
		s.GetElement();
		
	}

}
