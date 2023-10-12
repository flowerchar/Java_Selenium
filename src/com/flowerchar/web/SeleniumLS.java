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
    		driver.findElements(By.linkText("电影")).get(1).click();;
//    		System.out.println(movie);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
    		SLEEP(null);
    		driver.findElement(By.linkText("全部")).click();
    		driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
    		SLEEP(null);
    		driver.findElement(By.linkText("免费")).click();
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[3].toString());
    		SLEEP(null);
    		driver.findElement(By.linkText("动作")).click();
//       		List<WebElement> actionlist = driver.findElements(By.linkText("动作"));
//       		System.out.println(actionlist);
//       	    actionlist.get(1).click();
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[4].toString());
    		SLEEP(null);
    		driver.findElement(By.linkText("中国香港")).click();
    		SLEEP(null);
    		driver.findElement(By.linkText("2016")).click();
    		SLEEP(null);
    		List<WebElement> curList = driver.findElements(By.className("cur"));
    		curList.get(5).click();
    		SLEEP(null);
    		driver.findElements(By.tagName("i")).get(20).click();
    		driver.switchTo().window(driver.getWindowHandles().toArray()[3].toString());
    		SLEEP(null);
    		driver.findElement(By.name("wd")).sendKeys("周星驰");
    		SLEEP(null);
    		driver.findElement(By.className("search_btn")).click();
    		SLEEP(null);
    		driver.findElement(By.linkText("下一页")).click();
    		SLEEP(null);
    		Actions action1 = new Actions(driver);
//    		driver.findElement(By.partialLinkText("首页")).click();
//    		driver.findElements(By.className("icon_text")).get(0).click();
    		WebElement firstpage = driver.findElement(By.className("channel_home"));
    		String js = "window.scrollTo(0,0)";
    		JavascriptExecutor jsexc = (JavascriptExecutor) driver;
    		jsexc.executeScript(js);
    		SLEEP(5000);
    		action1.moveToElement(firstpage).doubleClick().perform();
//    		SLEEP(5000);
    		driver.findElement(By.linkText("电视剧")).click();
    		driver.switchTo().window(driver.getWindowHandles().toArray()[4].toString());
    		SLEEP(null);
    		driver.findElements(By.className("more")).get(0).click();
    		driver.switchTo().window(driver.getWindowHandles().toArray()[5].toString());
    		SLEEP(null);
    		driver.findElement(By.linkText("独播")).click();
    		driver.findElement(By.linkText("穿越")).click();
    		driver.findElement(By.linkText("2013")).click();
    		SLEEP(null);
    		driver.findElement(By.className("d_img")).click();
//    		driver.findElement(By.linkText("唐朝好男人")).click();
    		SLEEP(null);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[6].toString());
    		SLEEP(5000);
    		driver.findElements(By.linkText("花絮")).get(0).click();
    		SLEEP(null);
    		driver.findElements(By.linkText("分集剧情")).get(0).click();
    		SLEEP(null);
    		driver.findElement(By.linkText("乐迷畅谈")).click();
    		SLEEP(null);
    		driver.close();}

    
}


