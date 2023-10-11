package com.flowerchar.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAction {
    public WebDriver driver;
	public void InitDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\something\\chromedriver\\118\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("http://www.imooc.com/user/newlogin/from_url/1005/");

	}

	public void InputElement() {
		WebElement EmailElment = driver.findElement(By.name("email"));
		System.out.println(EmailElment);
		String userinfo = EmailElment.getAttribute("placeholder");
		EmailElment.sendKeys("55555");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		EmailElment.clear();
		System.out.println(userinfo);
		String mobile = EmailElment.getAttribute("value");
		System.out.println(mobile);
		boolean info = EmailElment.isEnabled();
		System.out.println(info);
		driver.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumAction s = new SeleniumAction();
		s.InitDriver();
		s.InputElement();
	}

}
