import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Test12306 {
    private WebDriver driver;
    @BeforeEach
    public  void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\86153\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.12306.cn/index/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    //test-code-start
    @FindBy(linkText = "车票")
    public WebElement chepiaoElement;
    @FindBy(linkText="单程")
    public WebElement g_hrefElement;
    @FindBy(linkText = "中转换乘")
    public WebElement zzhcElement;
    @FindBy(linkText = "往返")
    public WebElement wangfanElement;
    @FindBy(id = "fromStationText")
    public WebElement fromStationElement;
    @FindBy(id="toStationText")
    public  WebElement toStationElement;
    @FindBy(id="train_date")
    public  WebElement  trainDate;
    @FindBy(linkText="查询")
    public WebElement queryTicket;


    public void  meth_pub_001_002_003(){
        PageFactory.initElements(driver,this);
        Actions actions =new Actions(driver);
        actions.moveToElement(chepiaoElement).perform();
        g_hrefElement.click();
    }
    public void  meth_pub_004_005_006(){
        PageFactory.initElements(driver,this);
        Actions actions =new Actions(driver);
        actions.moveToElement(chepiaoElement).perform();
        wangfanElement.click();
    }
    public void  meth_pub_007_008_009(){
        PageFactory.initElements(driver,this);
        Actions actions =new Actions(driver);
        actions.moveToElement(chepiaoElement).perform();
        zzhcElement.click();
    }
    //R001
    @ParameterizedTest
    @CsvSource({
            "北京,广州,2024-10-26,test_12306_R001_001.png",
            "北京,成都,2024-10-31,test_12306_R001_002.png",
            "上海,广州,2024-11-09,test_12306_R001_003.png",
            "上海,成都,2024-10-26,test_12306_R001_004.png",
            "北京,广州,2024-11-09,test_12306_R001_005.png",
            "北京,成都,2024-10-26,test_12306_R001_006.png",
            "上海,广州,2024-10-31,test_12306_R001_007.png",
            "上海,成都,2024-11-09,test_12306_R001_008.png",
            "北京,成都,2024-11-09,test_12306_R001_009.png",
    })
    public void test_12306_R001(String fromStation,String toStation,String Date,String filename) throws InterruptedException {
        meth_pub_001_002_003();
        fromStationElement.click();
        fromStationElement.sendKeys(fromStation+Keys.ENTER);
        if (!Objects.equals(fromStation,"上海")){
           fromStationElement.sendKeys(Keys.BACK_SPACE);
        }
        toStationElement.click();
        toStationElement.sendKeys(toStation+Keys.ENTER);
        if (!Objects.equals(toStation,"上海")){
            toStationElement.sendKeys(Keys.BACK_SPACE);
        }
        trainDate.clear();
        trainDate.sendKeys(Date);
        queryTicket.click();
        Thread.sleep(1000);
        takeScreenshot(filename);
    }
    //R002
    @ParameterizedTest
    @CsvSource(
            {
                "郑州东,上海,2024-10-25,test_12306_R002_001.png",
                "郑州东,上海,2024-11-10,test_12306_R002_002.png"
            })
    public void test_12306_R002(String fromStation,String toStation,String Date,String filename) throws InterruptedException {
        meth_pub_001_002_003();
        fromStationElement.click();
        fromStationElement.sendKeys(fromStation+Keys.ENTER);
        toStationElement.click();
        toStationElement.sendKeys(toStation+Keys.ENTER);
        trainDate.clear();
        trainDate.sendKeys(Date);
        queryTicket.click();
        Thread.sleep(1000);
        takeScreenshot(filename);
    }
    //R003
    @FindBy(name = "cc_type")
    public WebElement checkboxOne;
    @FindBy(name="cc_from_station")
    public WebElement checkboxTwo;
    @FindBy(name="cc_to_station")
    public WebElement checkboxThree;
    @FindBy(name="cc_seat_type")
    public WebElement checkboxFour;
    @Test
    public void test_12306_R003() throws InterruptedException {
        meth_pub_001_002_003();
        fromStationElement.click();
        fromStationElement.sendKeys("北京"+Keys.ENTER);
        if (!Objects.equals("北京","上海")){
            fromStationElement.sendKeys(Keys.BACK_SPACE);
        }
        toStationElement.click();
        toStationElement.sendKeys("上海"+Keys.ENTER);
        trainDate.clear();
        //此处由于比赛日期已过 故选择一个有效日期去测试
        trainDate.sendKeys("2024-11-08");
        queryTicket.click();
        checkboxOne.click();
        checkboxTwo.click();
        checkboxThree.click();
        checkboxFour.click();
        Thread.sleep(2000);
        checkboxOne.click();
        checkboxTwo.click();
        checkboxThree.click();
        checkboxFour.click();
        Thread.sleep(1000);
        takeScreenshot("test_12306_R003_001.png");
    }
    //R004
    @FindBy(id="back_train_date")
    public  WebElement backTrainDate;
    @ParameterizedTest
    @CsvSource(
            {
                    "郑州东,上海,2024-11-01,2024-11-01,test_12306_R004_001.png",
                    "郑州东,上海,2024-11-01,2024-11-08,test_12306_R004_002.png",
                    "郑州东,上海,2024-11-01,2024-11-11,test_12306_R004_003.png"
            })
    public void test_12306_R004(String fromStation,String toStation,String Date,String backDate,String filename) throws InterruptedException {
        meth_pub_004_005_006();
        fromStationElement.click();
        fromStationElement.sendKeys(fromStation+Keys.ENTER);
        toStationElement.click();
        toStationElement.sendKeys(toStation+Keys.ENTER);
        trainDate.clear();
        trainDate.sendKeys(Date);
        backTrainDate.clear();
        backTrainDate.sendKeys(backDate);
        queryTicket.click();
        Thread.sleep(1000);
        takeScreenshot(filename);
    }
    //R005
    @ParameterizedTest
    @CsvSource(
            {
                    "郑州东,上海,2024-11-02,2024-11-01,test_12306_R005_001.png",
                    "郑州东,上海,2024-11-02,2024-11-12,test_12306_R005_002.png",
            })
    public void test_12306_R005(String fromStation,String toStation,String Date,String backDate,String filename) throws InterruptedException {
        meth_pub_004_005_006();
        fromStationElement.click();
        fromStationElement.sendKeys(fromStation+Keys.ENTER);
        toStationElement.click();
        toStationElement.sendKeys(toStation+Keys.ENTER);
        trainDate.clear();
        trainDate.sendKeys(Date);
        backTrainDate.clear();
        backTrainDate.sendKeys(backDate);
        queryTicket.click();
        Thread.sleep(1000);
        takeScreenshot(filename);
    }
    @FindBy(id="nav_list3")
    public WebElement navList3;
    @FindBy(xpath = "//li[@title=\'福州南\']")
    public WebElement fuZhouNan;
    @FindBy(xpath = "//li[@title=\'厦门\']")
    public WebElement xiaMen;
    @FindBy(id="sf2")
    public WebElement stu;
    @FindBy(xpath = "//*[@id=\"date_range\"]/ul/li[6]")
    public WebElement path1;
    @FindBy(xpath = "//*[@id=\"_ul_station_train_code\"]/li[8]")
    public WebElement path2;
    @FindBy(id = "from_station_name_all")
    public WebElement path3;
    @FindBy(id = "to_station_name_all")
    public WebElement path4;
    @FindBy(id = "avail_zk")
    public WebElement availZk;
    //R006
    @Test
    public void test_12306_R006() throws InterruptedException {
        meth_pub_004_005_006();
        fromStationElement.click();
        navList3.click();
        fuZhouNan.click();
        toStationElement.click();
        xiaMen.click();
        //由于比赛时间已过此处日期填写成出发日2024-11-12 返程日2024-11-15
        trainDate.clear();
        trainDate.sendKeys("2024-11-12");
        backTrainDate.clear();
        backTrainDate.sendKeys("2024-11-15");
        stu.click();
        queryTicket.click();
        //此处在Tab中日期选择为11-13
        path1.click();
        path2.click();
        path3.click();
        path4.click();
        availZk.click();
        Thread.sleep(1000);
        takeScreenshot("test_12306_R006_001.png");
    }

    @FindBy(id="train_start_date")
    public WebElement trainStartDate;
    @ParameterizedTest
    @CsvSource({
            //此处日期选择2024-11-22
            "哈尔滨,济南,2024-11-22,test_12306_R007_001.png",
            "哈尔滨,西安,2024-11-22,test_12306_R007_002.png",
            "哈尔滨,拉萨,2024-11-22,test_12306_R007_003.png",
            "长春,济南,2024-11-22,test_12306_R007_004.png",
            "长春,西安,2024-11-22,test_12306_R007_005.png",
            "长春,拉萨,2024-11-22,test_12306_R007_006.png",
            "安吉,济南,2024-11-22,test_12306_R007_007.png",
            "安吉,西安,2024-11-22,test_12306_R007_008.png",
            "安吉,拉萨,2024-11-22,test_12306_R007_009.png"
    })
    public  void test_12306_R007(String fromStation,String toStation,String Date,String filename) throws InterruptedException {
        meth_pub_007_008_009();
        fromStationElement.click();
        fromStationElement.sendKeys(fromStation+Keys.ENTER);
        if(Objects.equals(fromStation,"哈尔滨")){
            fromStationElement.sendKeys(Keys.BACK_SPACE);
        }
        toStationElement.click();
        toStationElement.sendKeys(toStation+Keys.ENTER);
        if(Objects.equals(toStation,"西安")){
            toStationElement.sendKeys(Keys.BACK_SPACE);
        }
        trainStartDate.clear();
        trainStartDate.sendKeys(Date);
        queryTicket.click();
        Thread.sleep(1000);
        takeScreenshot(filename);
    }
    @FindBy(id = "radio_input_search")
    public WebElement radioInputSearch;
    @FindBy(id="changeStationText")
    public WebElement  changeStationText;
    @ParameterizedTest
    @CsvSource({
            //此处日期选择2024-11-22
            "郑州东,上海,2024-11-22,'',test_12306_R008_001.png",
            "郑州东,上海,2024-11-22,&$,test_12306_R008_002.png",
            "郑州东,上海,2024-11-22,红苹果,test_12306_R008_003.png",

    })
    public  void test_12306_R008(String fromStation,String toStation,String Date,String param,String filename) throws InterruptedException {
        meth_pub_007_008_009();
        fromStationElement.click();
        fromStationElement.sendKeys(fromStation+Keys.ENTER);
        toStationElement.click();
        toStationElement.sendKeys(toStation+Keys.ENTER);
        trainStartDate.clear();
        trainStartDate.sendKeys(Date);
        radioInputSearch.click();
        changeStationText.click();
        changeStationText.sendKeys(param);
        queryTicket.click();
        Thread.sleep(1000);
        takeScreenshot(filename);
    }
    @ParameterizedTest
    @CsvSource({
            //此处日期选择2024-11-22
            "哈尔滨,南京,2024-11-22,济南,test_12306_R009_001.png",
            "哈尔滨,南京,2024-11-22,安阳,test_12306_R009_002.png",
            "哈尔滨,南京,2024-11-22,周口,test_12306_R009_003.png",

    })
    public  void test_12306_R009(String fromStation,String toStation,String Date,String param,String filename) throws InterruptedException {
        meth_pub_007_008_009();
        fromStationElement.click();
        fromStationElement.sendKeys(fromStation+Keys.ENTER);
        if(Objects.equals(fromStation,"哈尔滨")){
            fromStationElement.sendKeys(Keys.BACK_SPACE);
        }
        toStationElement.click();
        toStationElement.sendKeys(toStation+Keys.ENTER);

        trainStartDate.clear();
        trainStartDate.sendKeys(Date);
        radioInputSearch.click();
        changeStationText.click();
        changeStationText.sendKeys(param+Keys.ENTER);

        if(Objects.equals(param,"周口")){
            changeStationText.sendKeys(Keys.BACK_SPACE);
        }
        queryTicket.click();
        Thread.sleep(2000);
        takeScreenshot(filename);
    }

    //自动发挥部分省略
    //test-code-end





    @AfterEach
    public  void teardown(){
        this.driver.quit();
    }
    private void takeScreenshot(String fileName) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HHmmssSSS");
        String timestamp = dateFormat.format(new Date());
        String timestampedFileName = timestamp + "_" + fileName;
        File screenshotsDir = new File("screenshots");
        if (!screenshotsDir.exists()) {
            screenshotsDir.mkdirs();
        }
        String screenshotFilePath = screenshotsDir.getAbsolutePath() + File.separator + timestampedFileName;
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, new File(screenshotFilePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
