package com.flowerchar.web;

import java.util.List;

import org.apache.xalan.trace.TraceListener;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumLS {
	
	public static Integer ms=4000;
	public static void SLEEP(Integer time) {
		if(time==null) {
			try {
				Thread.sleep(ms);
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("time..");
			}
		}else {
			try {
				Thread.sleep(time);
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("time..");
			}
		}

	}
	
    public static void main(String[] args) {
      
    		System.setProperty("webdriver.chrome.driver", "D:\\something\\chromedriver\\118\\chromedriver.exe"); 
    		WebDriver driver = new ChromeDriver();
    		driver.get("http://www.le.com/");
    		driver.manage().window().maximize();
    		SLEEP(null);
    		driver.findElements(By.linkText("��Ӱ")).get(1).click();;
//    		System.out.println(movie);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
    		SLEEP(null);
    		driver.findElement(By.linkText("ȫ��")).click();
    		driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
    		SLEEP(null);
    		driver.findElement(By.linkText("���")).click();
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[3].toString());
    		SLEEP(null);
    		driver.findElement(By.linkText("����")).click();
//       		List<WebElement> actionlist = driver.findElements(By.linkText("����"));
//       		System.out.println(actionlist);
//       	    actionlist.get(1).click();
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[4].toString());
    		SLEEP(null);
    		driver.findElement(By.linkText("�й����")).click();
    		SLEEP(null);
    		driver.findElement(By.linkText("2016")).click();
    		SLEEP(null);
    		List<WebElement> curList = driver.findElements(By.className("cur"));
    		curList.get(5).click();
    		SLEEP(null);
    		driver.findElements(By.tagName("i")).get(20).click();
    		driver.switchTo().window(driver.getWindowHandles().toArray()[3].toString());
    		SLEEP(null);
    		driver.findElement(By.name("wd")).sendKeys("���ǳ�");
    		SLEEP(null);
    		driver.findElement(By.className("search_btn")).click();
    		SLEEP(null);
    		driver.findElement(By.linkText("��һҳ")).click();
    		SLEEP(null);
    		Actions action1 = new Actions(driver);
//    		driver.findElement(By.partialLinkText("��ҳ")).click();
//    		driver.findElements(By.className("icon_text")).get(0).click();
    		WebElement firstpage = driver.findElement(By.className("channel_home"));
    		String js = "window.scrollTo(0,0)";
    		JavascriptExecutor jsexc = (JavascriptExecutor) driver;
    		jsexc.executeScript(js);
    		SLEEP(5000);
    		action1.moveToElement(firstpage).doubleClick().perform();
//    		SLEEP(5000);
    		driver.findElement(By.linkText("���Ӿ�")).click();
    		driver.switchTo().window(driver.getWindowHandles().toArray()[4].toString());
    		SLEEP(null);
    		driver.findElements(By.className("more")).get(0).click();
    		driver.switchTo().window(driver.getWindowHandles().toArray()[5].toString());
    		SLEEP(null);
    		driver.findElement(By.linkText("����")).click();
    		driver.findElement(By.linkText("��Խ")).click();
    		driver.findElement(By.linkText("2013")).click();
    		SLEEP(null);
    		driver.findElement(By.className("d_img")).click();
//    		driver.findElement(By.linkText("�Ƴ�������")).click();
    		SLEEP(null);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[6].toString());
    		SLEEP(5000);
    		driver.findElements(By.linkText("����")).get(0).click();
    		SLEEP(null);
    		driver.findElements(By.linkText("�ּ�����")).get(0).click();
    		SLEEP(null);
    		driver.findElement(By.linkText("���Գ�̸")).click();
    		SLEEP(null);
    		driver.close();}

    
}


