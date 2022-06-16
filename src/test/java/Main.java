import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    private static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
        driver = new ChromeDriver();
        driver.get("https://translate.google.com/");
        driver.findElement(By.className("er8xn")).click();
        driver.findElement(By.className("er8xn")).sendKeys("hallo world");
        System.setProperty("webdriver.gecko.driver",Constants.FIREFOXDRIVER_PATH);
        driver = new FirefoxDriver();
        driver.get("https://translate.google.com/");
        driver.findElement(By.className("er8xn")).click();
        driver.findElement(By.className("er8xn")).sendKeys("הדר שלי אני אוהב אותך");
    }
}
