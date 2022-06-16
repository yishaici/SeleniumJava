import io.opentelemetry.sdk.logs.data.Body;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.text.html.HTML;

public class FireFoxBrowser {
    private static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", Constants.FIREFOXDRIVER_PATH);
        driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");
        driver.findElement(By.cssSelector("input[id=search]")).sendKeys("hallo");
        System.out.println(driver.findElement(By.cssSelector("input[id=search]")));

//        System.setProperty("webdriver.gecko.driver", Constants.FIREFOXDRIVER_PATH);
//        driver = new FirefoxDriver();
//        driver.get("https://www.selenium.dev/");
//        driver.findElement(By.cssSelector("div[class=navbar-nav]")).click();
//        driver.findElement(By.cssSelector("div[class=navbar-nav]")).sendKeys("selenium");
//        System.out.println(driver.findElement(By.cssSelector("div[class=navbar-nav]")));
    }
}
