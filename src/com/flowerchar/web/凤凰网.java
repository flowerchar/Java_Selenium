import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
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
    		
    		driver.get("https://www.ifeng.com/");
    		driver.manage().window().maximize();
    		Thread.sleep(20000);
    		driver.findElement(By.linkText("资讯")).click();//1咨询
    		Thread.sleep(1500);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("新时代")).click();//2新时代
    		Thread.sleep(1500);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("+ 更多新闻")).click();//3更多新闻
    		Thread.sleep(1500);
    		driver.findElement(By.className("index_go_to_top_A0C-y")).click();//4置顶
    		Thread.sleep(1500);	
    		driver.findElement(By.linkText("凤凰资讯")).click();//5选择凤凰资讯
    		Thread.sleep(1500);	
    		driver.switchTo().window(driver.getWindowHandles().toArray()[3].toString());
    		Thread.sleep(1500);
//    		driver.findElement(By.className("index_checked_2L1JS")).click();//6站内框
//    		Thread.sleep(1500);
//    		driver.findElement(By.linkText("站内")).click();//7站内
//    		Thread.sleep(2500);	
    		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[2]/input")).sendKeys("科技");//6搜索框
    		Thread.sleep(1500);
    		driver.findElement(By.className("index_btn_S-5T7")).click();//7点击
    		Thread.sleep(1500);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[4].toString());
    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());//速度过题
//    		Thread.sleep(1500);
    		driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div[2]/ul/li[1]/div/h2/a")).click();//8  2023慕尼黑国际车展
    		Thread.sleep(1500);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[5].toString());
    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[3].toString());//速度过题
//    		Thread.sleep(1500);
    		driver.findElement(By.className("index_item_box_t--L6")).click();//9 现场直击
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("2023慕尼黑车展：大众全新Tiguan亮相，预计2024年上市")).click();//10  2023慕尼黑车展：大众全新Tiguan亮相，预计2024年上市
    		Thread.sleep(1500);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[6].toString());
    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[4].toString());//速度过题
//    		Thread.sleep(1500);
    		driver.findElement(By.className("text-2sXTFgZW")).click();//11  人参与
    		Thread.sleep(1500);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[7].toString());
    		Thread.sleep(1500);
//    		driver.switchTo().window(driver.getWindowHandles().toArray()[5].toString());//速度过题
//    		Thread.sleep(1500);
    		driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div/div[2]/span[1]/a[2]")).click();//12 最新处 回复
    		Thread.sleep(1500);
    		driver.findElement(By.className("w-submitBtn")).click();//13 发表
    		Thread.sleep(2500);
    		Alert b = driver.switchTo().alert();
    		b.accept();
    		Thread.sleep(2500);	
    		driver.findElement(By.className("w-commentArea")).sendKeys("优秀");//14输入
    		Thread.sleep(1500);	
    		driver.findElement(By.className("icon-faceTrigArr")).click();//15表情
    		Thread.sleep(2500);	
    		driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/div/div[3]/div[1]/form/div[2]/div/div/div[2]/div/div[2]/ul/li[20]/img")).click();//18拜拜表情
    		Thread.sleep(1500);	
//    		driver.findElement(By.linkText("取消")).click();//15取消
//    		Thread.sleep(1500);
    		driver.findElement(By.id("js_toTop")).click();//16 置顶
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("凤凰网首页")).click();//17凤凰网首页
    		Thread.sleep(1500);	
    		driver.switchTo().window(driver.getWindowHandles().toArray()[8].toString());
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("视频")).click();//18 视频
    		Thread.sleep(1500);	
    		driver.switchTo().window(driver.getWindowHandles().toArray()[9].toString());
    		Thread.sleep(1500);
    		driver.findElement(By.className("index_more_T32Gd")).click();//19更多
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("美食")).click();//20 美食
    		Thread.sleep(1500);	
    		driver.switchTo().window(driver.getWindowHandles().toArray()[10].toString());
    		Thread.sleep(1500);
    		driver.findElement(By.xpath("/html/body/div/div[4]/div[1]/div[2]/a/div/img")).click();//21 第二个视频
    		Thread.sleep(1500);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[11].toString());
    		Thread.sleep(1500);
    		driver.findElement(By.className("index_vSelect_1csYP")).click();//22更多
    		Thread.sleep(3000);
//    		WebElement e = driver.findElement(By.className("index_vSelect_1csYP"));//频道
//    		Actions c = new Actions(driver);
//    		c.moveToElement(e).perform();
//    		Thread.sleep(2500);
    		driver.findElement(By.linkText("凤凰首页")).click();//23 凤凰首页
    		Thread.sleep(1500);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[12].toString());
    		Thread.sleep(1500);
    		driver.findElement(By.className("index_login_name_2x_UU-Kq")).click();//24 名字
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("进入个人中心")).click();//25 个人中心
    		Thread.sleep(1500);
    		driver.switchTo().window(driver.getWindowHandles().toArray()[13].toString());
    		Thread.sleep(1500);
    		driver.findElement(By.linkText("注销")).click();//26注销
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