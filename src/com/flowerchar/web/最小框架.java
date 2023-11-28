import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

@SuppressWarnings("unused")
public class Example {

    // Mooctest Selenium Example

    // public static Integer 3000 = 3000;
    // <!> Check if selenium-standalone.jar is added to build path.

    public static void test(WebDriver driver) {
        // TODO Test script
        // eg:driver.get("https://www.baidu.com/")
        // eg:driver.findElement(By.id("wd"));
    	
    	
    	try {
    		

    		driver.get("https://www.qidian.com/");
    		driver.manage().window().maximize();
    		Thread.sleep(30000);
    		driver.findElement(By.linkText("全部作品")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.linkText("玄幻")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.linkText("东方玄幻")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div[2]/ul/li[3]/a")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.linkText("VIP")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.linkText("200万字以上")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.className("iconfont")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.linkText("总收藏")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.linkText("圣墟")).click();
    		Thread.sleep(3000);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
    		Thread.sleep(3000);
    		driver.findElement(By.linkText("互动投票")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.linkText("目录")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.id("catalogReverse")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.className("go-top")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.className("writer-name")).click();
    		Thread.sleep(3000);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/ul/li[3]/a/img")).click();
    		Thread.sleep(3000);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[3].toString());
    		driver.findElement(By.id("readBtn")).click();
    		Thread.sleep(3000);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[4].toString());
    		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[5]/button")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[3]/button")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.linkText("书详情")).click();
    		Thread.sleep(3000);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[5].toString());
    		Thread.sleep(3000);
    		driver.findElement(By.linkText("免费")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.linkText("免费作品")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/a")).click();
    		Thread.sleep(3000);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[6].toString());
    		Thread.sleep(3000);
    		driver.findElement(By.className("mr12")).click();
    		Thread.sleep(3000);
    		driver.findElement(By.id("elDelete")).click();
    		Thread.sleep(3000);
    		
    		
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