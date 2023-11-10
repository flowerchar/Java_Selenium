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
    		

    		driver.get("https://www.qidian.com/");
    		driver.manage().window().maximize();
    		Thread.sleep(30000);
    		driver.findElement(By.linkText("全部作品")).click();//1全部作品
    		Thread.sleep(500);
    		driver.findElement(By.linkText("玄幻")).click();//2玄幻
    		Thread.sleep(500);
    		driver.findElement(By.linkText("东方玄幻")).click();//3东方玄幻
    		Thread.sleep(500);
    		driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/div[2]/ul/li[3]/a")).click();//4完本
    		Thread.sleep(500);
    		driver.findElement(By.linkText("VIP")).click();//5vip
    		Thread.sleep(500);
    		driver.findElement(By.linkText("200万字以上")).click();//6 200万字以上
    		Thread.sleep(500);
    		driver.findElement(By.className("iconfont")).click();//7 人气排序
    		Thread.sleep(500);
    		driver.findElement(By.linkText("总收藏")).click();//8 总收藏
    		Thread.sleep(500);
    		driver.findElement(By.linkText("圣墟")).click();//9圣墟
    		Thread.sleep(500);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
    		Thread.sleep(500);
    		driver.findElement(By.linkText("互动投票")).click();//10 互动投票
    		Thread.sleep(1000);
    		driver.findElement(By.linkText("目录")).click();//11 目录
    		Thread.sleep(1000);
    		driver.findElement(By.id("catalogReverse")).click();//12 倒叙
    		Thread.sleep(1000);
    		driver.findElement(By.className("go-top")).click();//13制定
    		Thread.sleep(1000);
    		driver.findElement(By.className("writer-name")).click();//14 城东
    		Thread.sleep(1000);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
    		Thread.sleep(500);
    		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/ul/li[3]/a/img")).click();//15神墓
    		Thread.sleep(1000);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[3].toString());
    		driver.findElement(By.id("readBtn")).click();//16开始阅读
    		Thread.sleep(2000);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[4].toString());
    		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[5]/button")).click();//17夜间模式
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[3]/button")).click();//18加入书架
    		Thread.sleep(2000);
    		driver.findElement(By.linkText("书详情")).click();//19 书详情
    		Thread.sleep(1000);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[5].toString());
    		Thread.sleep(1000);
    		driver.findElement(By.linkText("免费")).click();//20免费
    		Thread.sleep(2000);
    		driver.findElement(By.linkText("免费作品")).click();//21搜索
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/a")).click();//22我的书
    		Thread.sleep(2000);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[6].toString());
    		Thread.sleep(1000);
    		driver.findElement(By.className("mr12")).click();//23
    		Thread.sleep(2000);
    		driver.findElement(By.id("elDelete")).click();//24更新时间
    		Thread.sleep(2000);
    		
    		
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