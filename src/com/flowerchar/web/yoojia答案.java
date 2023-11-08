import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

@SuppressWarnings("unused")
public class Example {

    // Mooctest Selenium Example


    // <!> Check if selenium-standalone.jar is added to build path.

    public static void test(WebDriver driver) {
        // TODO Test script
        // eg:driver.get("https://www.baidu.com/")
        // eg:driver.findElement(By.id("wd"));
    	
    	
    	try {
    		

    		driver.get("https://www.yoojia.com/");
    		driver.manage().window().maximize();
    		Thread.sleep(5000);
    		driver.findElement(By.className("i-select")).click();
    		Thread.sleep(1500);
    		driver.findElement(By.xpath("/html/body/div[1]/section/header/div/div/div[2]/div[1]/div[2]/section/div/div[2]/div[1]/div[2]/div[3]/div")).click();//2广州
    		Thread.sleep(2500);
    		driver.findElement(By.linkText("车型库")).click();//
    		Thread.sleep(1500);
    		driver.findElement(By.className("brand-8")).click();//
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("40万以上")).click();//
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("轿车")).click();//
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("德国")).click();
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("价格从高到低")).click();
    		Thread.sleep(1500);
    		driver.findElement(By.xpath("/html/body/div[1]/section/main/div/section/div[2]/div[2]/div[8]/a/img")).click();//
    		Thread.sleep(1500);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
    		Thread.sleep(500);
    		driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[2]/div/div/h2[2]")).click();//
    		Thread.sleep(500);
    		driver.findElement(By.linkText("参数")).click();//
    		Thread.sleep(500);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
    		Thread.sleep(1500);
    		driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[1]/div/div[2]")).click();//
    		driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[1]/div/div[8]")).click();//
    		Thread.sleep(500);
    		driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[1]/div/div[12]")).click();//
    		Thread.sleep(500);
    		driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[1]/div/div[16]")).click();//
    		Thread.sleep(500);
    		driver.close();
    		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[2]/div/div/h2[3]")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[5]/div[1]/a")).click();
    		Thread.sleep(1000);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
    		Thread.sleep(1000);
    		driver.findElement(By.id("tab-内饰")).click();
			Thread.sleep(1000);
    		driver.findElement(By.id("tab-空间")).click();
    		Thread.sleep(500);
    		driver.findElement(By.id("tab-官方图")).click();
    		Thread.sleep(500);
    		driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div[3]/div[2]/div[4]/div/div/ul/li/div[2]/div[1]/img")).click();
    		Thread.sleep(1000);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[3].toString());
    		Thread.sleep(1000);
    		driver.findElement(By.className("gallery-button-next")).click();
    		
    		
    		
    		
    		
    		
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