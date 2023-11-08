package com.flowerchar.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TikTok {
	
	public static int ms = 3000;
	
	public static void test(WebDriver driver) throws Exception {
		driver.get("https://www.douyin.com/");
		driver.manage().window().maximize();
		Thread.sleep(ms);
		driver.findElement(By.className("TgFPIucP"));
		Thread.sleep(ms);
		driver.findElements(By.className("xgplayer-setting-label")).get(1).click();
		Thread.sleep(ms);
		driver.findElement(By.className("xgplayer-volume")).click();
		Thread.sleep(ms);
		driver.findElements(By.className("NRiH5zYV")).get(3).click();
		Thread.sleep(ms);
		driver.findElements(By.className("NRiH5zYV")).get(4).click();
		Thread.sleep(ms);
		WebElement box1 = driver.findElement(By.className("XAze1wis"));
		box1.findElements(By.tagName("span")).get(1).click();
		Thread.sleep(ms);
		driver.findElements(By.className("dXGx1zv9")).get(8).click();
		Thread.sleep(ms);
		WebElement input1 = driver.findElement(By.className("public-DraftStyleDefault-ltr"));
		input1.click();
		input1.sendKeys("¾«²Ê");
		driver.findElement(By.className("OGIa7O6a")).click();
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			test(driver);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			driver.quit();
		}
	}

}
