import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.List;

import org.openqa.selenium.Alert;
@SuppressWarnings("unused")
public class Example {

    // Mooctest Selenium Example


    // <!> Check if selenium-standalone.jar is added to build path.

    public static void test(WebDriver driver) {
        // TODO Test script
        // eg:driver.get("https://www.baidu.com/")
        // eg:driver.findElement(By.id("wd"));
    	
    	
    	try {
    		
    		driver.get("http://121.43.149.85/");
    		driver.manage().window().maximize();
    		Thread.sleep(10000);
    		
    		driver.findElement(By.id("username")).clear();
    		Thread.sleep(2000);
    		driver.findElement(By.id("password")).clear();
    		Thread.sleep(2000);
    		
    		driver.findElement(By.id("username")).sendKeys("sunkang@mooctest.com");//1账号
    		Thread.sleep(2000);
    		driver.findElement(By.id("password")).sendKeys("123456");//2密码
    		Thread.sleep(2000);
    		driver.findElement(By.id("loginbutton")).click();//3登录
    		Thread.sleep(10000);
    		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/div")).click();//4商品管理
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[1]/div/ul/div[2]/li/ul/div[1]/a/li")).click();//5商品分类
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("/html/body/div/div/div[2]/section/div[1]/div[1]/div[2]/span/button[1]/span")).click();//6新增
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div/div/input")).sendKeys("测试");//7商品名称
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[2]/div/div/div[1]/i")).click();//8 加好
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/section/main/div/div[2]/div/div[1]/div/div[3]/div/div/div[2]/label/span[1]/span")).click();//9选择第三个
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/span/button[2]")).click();//10确定
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[3]/div/div/label[2]/span[2]")).click();//11隐藏
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/button[2]")).click();//12确定
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/section/div[1]/div[1]/div[1]/div/input")).sendKeys("测试");//13 搜索测试
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/section/div[1]/div[1]/div[1]/span/button[1]")).click();//14搜索确定
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/section/div[1]/div[2]/div[4]/div[2]/table/tbody/tr/td[5]/div/div/span/span/button")).click();//15删除
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("/html/body/div[4]/div[1]/button[2]")).click();//16确定删除
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div/ul/div[4]/li/div")).click();//17选择订单管理
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div/ul/div[4]/li/ul/div[3]/a/li/span")).click();//18物流快递
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("/html/body/div/div/div[2]/section/div[1]/div[1]/div/button/span")).click();//19物流快递新增
    		Thread.sleep(2000);
    		List<WebElement> inputs = driver.findElements(By.className("el-input__inner"));
    	    inputs.get(2).sendKeys("Test01");
    	    Thread.sleep(2000);
    	    inputs = driver.findElements(By.className("el-input__inner"));
	        inputs.get(3).sendKeys("Test01"); 
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/button[2]")).click();;
	        Thread.sleep(3000);
//    		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/form/div[1]/div/div/input")).sendKeys("test01");//19物流快递新增
//    		Thread.sleep(2000);
//    		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/form/div[2]/div/div/input")).sendKeys("test01");//19物流快递新增
//    		Thread.sleep(2000);
//    		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/button[2]")).click();//19物流快递新增
//    		Thread.sleep(2000);
//    		
    		
    		
    		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/section/div[1]/div[2]/div[3]/table/tbody/tr[1]/td[4]/div/span/span/button")).click();//20物流快递删除
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("/html/body/div[3]/div[1]/button[2]")).click();//20物流快递删除
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