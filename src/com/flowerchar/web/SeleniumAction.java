package com.flowerchar.web;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumAction {
    public WebDriver driver;
	public void InitDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\something\\chromedriver\\118\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("http://www.imooc.com/user/newlogin/from_url/1005/");

	}

//	public void InputElement() {
//		WebElement EmailElment = driver.findElement(By.name("email"));
//		System.out.println(EmailElment);
//		String userinfo = EmailElment.getAttribute("placeholder");
//		EmailElment.sendKeys("55555");
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
////		EmailElment.clear();
//		System.out.println(userinfo);
//		String mobile = EmailElment.getAttribute("value");
//		System.out.println(mobile);
//		boolean info = EmailElment.isEnabled();
//		System.out.println(info);
//		driver.close();
//	}
	public void InputElement() {
		WebElement EmailElment = driver.findElement(By.name("email"));
		System.out.println(EmailElment);
		String userinfo = EmailElment.getAttribute("placeholder");
		EmailElment.sendKeys("19822636863");
		driver.findElement(By.name("password")).sendKeys("qh010119");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		EmailElment.clear();
        driver.findElement(By.className("moco-btn-red")).click();
		String mobile = EmailElment.getAttribute("value");

		boolean info = EmailElment.isEnabled();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.close();
	}
	
	public void Radio() {
//		driver.get("http://www.imooc.com/user/setprofile");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.className("js-edit-info")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement userform = driver.findElement(By.id("profile"));
		List<WebElement> SexList = userform.findElements(By.name("sex"));
//		List<WebElement> SexList = driver.findElements(By.name("sex"));
		for(WebElement e:SexList) {
			if(e.isSelected()) {
				break;
			}else {
				e.click();
			}
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		
	}
	
	public void UpFile1() {
		driver.get("http://www.imooc.com/user/setprofile");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement PIC = driver.findElement(By.className("avator-img"));
		Actions action = new Actions(driver);
		action.moveToElement(PIC).perform();
		driver.findElement(By.className("js-avator-link")).click();;
		driver.findElement(By.id("upload")).sendKeys("D:\\desktop\\pictures\\images\\blue.png");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	
	public void UpFile2() throws AWTException {
		driver.get("http://www.imooc.com/user/setprofile");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement PIC = driver.findElement(By.className("avator-img"));
		Actions action = new Actions(driver);
		action.moveToElement(PIC).perform();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.className("js-avator-link")).click();
		driver.findElement(By.className("avator-btn-fake")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.findElement(By.id("upload")).sendKeys("D:\\desktop\\pictures\\images\\blue.png");
		StringSelection selectpng = new StringSelection("D:\\desktop\\pictures\\images\\blue.png");
        Clipboard sysc = Toolkit.getDefaultToolkit().getSystemClipboard();
        sysc.setContents(selectpng, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	
	public void Button() {
		String jsString = "document.getElementsByClassName('moco-btn-lg')[0].style.display='None'";
		WebElement button = driver.findElement(By.className("moco-btn-lg"));
		System.out.println(button.isEnabled());
		System.out.println(button.isDisplayed());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(jsString);
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
		WebElement button1 = driver.findElement(By.className("moco-btn-lg"));
		System.out.println(button1.isEnabled());
		System.out.println(button1.isDisplayed());
	}
	
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		SeleniumAction s = new SeleniumAction();
		s.InitDriver();
		s.InputElement();
//		s.Radio();
//		s.Button();
		s.UpFile2();
	}

}
