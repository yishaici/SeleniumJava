import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethodsTest {
    private static WebDriver driver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver" , Constants.CHROMEDRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/watch?v=kKq77mJHMow");
//        https://www.youtube.com/user/YohananCinnamon/videos
        driver.findElement(By.className("ytp-play-button ytp-button")).click();
    }

    @Test
    public void test01_getCurrentURL(){
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void test02_getTitle(){
        System.out.println(driver.getTitle());
    }

//    @Test
//    public void test03_getPageSource(){
//        System.out.println(driver.getPageSource());
//    }

    @Test
    public void test04_getCurrentTabHandle(){
        System.out.println(driver.getWindowHandle());
    }

    @Test
    public void test05_getAllTabsHandles(){
        System.out.println(driver.getWindowHandles());
    }

//    @Test
//    public void test06_navigateToGoogle(){
//        driver.navigate().to("https://www.youtube.com/watch?v=kKq77mJHMow");}


    @Test
    public void test07_navigateBackToTranslate(){
        driver.navigate().back();
    }

    @Test
    public void test08_navigateForwardToGoogle(){
        driver.navigate().forward();
    }

    @Test
    public void test09_closeCurrentTab(){
        driver.close();
    }

//    @Test
//    public void test10_click(){
////        driver.findElement(By.className("ytp-play-button ytp-button")).click();
//    }

    @AfterClass
    public static void tearDown(){
//        driver.quit();
    }
}
