package com.flowerchar.web;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

@SuppressWarnings("unused")
public class NormalAnswer {
	public static void test(WebDriver driver) {
        // TODO Test script
        // eg:driver.get("https://www.baidu.com/")
        // eg:driver.findElement(By.id("wd"));
    	
    	
    	try {
    		
//    		driver.get("https://www.le.com/");
//    		driver.manage().window().maximize();
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("电影")).click();//1
//    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
//    		Thread.sleep(1500);
//    		driver.findElement(By.className("curr")).click();//2
//    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());//
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("免费")).click();//3
//    		Thread.sleep(1500);
//    		//driver.findElement(By.linkText("喜剧")).click();//6
//    		//Thread.sleep(1500);
//    		//driver.findElement(By.linkText("爱情")).click();//7
//    		//Thread.sleep(1500);
//    		driver.findElement(By.linkText("动作")).click();//4
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("中国香港")).click();//5
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("2016")).click();//6
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("最新")).click();//7
//    		Thread.sleep(1500);
//    		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/dl[1]/dd[1]/a/i")).click();//8
//    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[3].toString());
//    		Thread.sleep(1500);
//    		driver.findElement(By.className("search_input")).sendKeys("周星驰");//9////////
//    		Thread.sleep(1500);
//    		driver.findElement(By.className("search_btn")).click();//10
//    		Thread.sleep(1500);
//    		//driver.findElement(By.linkText("展开更多")).click();//11
//    		//Thread.sleep(1500);
//    		driver.findElement(By.linkText("下一页")).click();//12
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("首页")).click();//13
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("电视剧")).click();//14
//    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[4].toString());
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("更多")).click();//15
//    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[5].toString());
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("独播")).click();//16
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("穿越")).click();//17
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("2013")).click();//18
//    		Thread.sleep(1500);
//    		driver.findElement(By.className("d_img")).click();//19
//    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[6].toString());
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("预告片")).click();//20
//    		Thread.sleep(1500);
    		driver.get("https://www.le.com/tv/88510.html");
    		driver.findElement(By.linkText("花絮")).click();//21
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("分集剧情")).click();//22
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("乐迷畅谈")).click();//23
    		Thread.sleep(1500);
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	
    }

    public static void main(String[] args) {
        // Run main function to test your script.
        WebDriver driver = new ChromeDriver();
        try { test(driver); } 
        catch(Exception e) { e.printStackTrace(); }
        finally { driver.quit(); }
    }

}
