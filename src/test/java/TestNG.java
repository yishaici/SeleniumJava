import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
    private static WebDriver driver1;
    @BeforeTest
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver" , Constants.CHROMEDRIVER_PATH);
        driver1 = new ChromeDriver();


}
//@Test
//public void ChromeDriver() {
//    driver1.get("https://www.walla.co.il");
//}
//@AfterClass
//public static void tearDown(){
//    driver1.quit();
//}
//
//    private static WebDriver driver2;
//@BeforeClass
//        public static void test02() {
//    System.setProperty("webdriver.gecko.driver", Constants.FIREFOXDRIVER_PATH);
//    driver2 = new FirefoxDriver();
//}
//@Test
//    public void FirefoxDriver(){
//        driver2.get("https://www.ynet.co.il/");
//}
//@AfterClass
//public static void Down(){
//    driver2.quit();
//}
    @Test
   public static void ChromeDriver(){
        driver1.get("https://translate.google.co.il/");
        driver1.findElement(By.className("er8xn")).click();
        driver1.findElement(By.className("er8xn")).sendKeys("משהו בעברית");

    }
}