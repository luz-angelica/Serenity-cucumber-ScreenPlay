package utils.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverUtils {

    public static WebDriver driver;

    public static WebDriver inThePage(String url) {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/webdriver/webdriverFilezilla/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        return driver;
    }
}
