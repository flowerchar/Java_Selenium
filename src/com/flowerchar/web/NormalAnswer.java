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
//    		driver.findElement(By.linkText("��Ӱ")).click();//1
//    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
//    		Thread.sleep(1500);
//    		driver.findElement(By.className("curr")).click();//2
//    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());//
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("���")).click();//3
//    		Thread.sleep(1500);
//    		//driver.findElement(By.linkText("ϲ��")).click();//6
//    		//Thread.sleep(1500);
//    		//driver.findElement(By.linkText("����")).click();//7
//    		//Thread.sleep(1500);
//    		driver.findElement(By.linkText("����")).click();//4
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("�й����")).click();//5
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("2016")).click();//6
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("����")).click();//7
//    		Thread.sleep(1500);
//    		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/dl[1]/dd[1]/a/i")).click();//8
//    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[3].toString());
//    		Thread.sleep(1500);
//    		driver.findElement(By.className("search_input")).sendKeys("���ǳ�");//9////////
//    		Thread.sleep(1500);
//    		driver.findElement(By.className("search_btn")).click();//10
//    		Thread.sleep(1500);
//    		//driver.findElement(By.linkText("չ������")).click();//11
//    		//Thread.sleep(1500);
//    		driver.findElement(By.linkText("��һҳ")).click();//12
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("��ҳ")).click();//13
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("���Ӿ�")).click();//14
//    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[4].toString());
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("����")).click();//15
//    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[5].toString());
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("����")).click();//16
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("��Խ")).click();//17
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("2013")).click();//18
//    		Thread.sleep(1500);
//    		driver.findElement(By.className("d_img")).click();//19
//    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[6].toString());
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("Ԥ��Ƭ")).click();//20
//    		Thread.sleep(1500);
    		driver.get("https://www.le.com/tv/88510.html");
    		driver.findElement(By.linkText("����")).click();//21
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("�ּ�����")).click();//22
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("���Գ�̸")).click();//23
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
