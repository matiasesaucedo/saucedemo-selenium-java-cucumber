package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BrowserDriver {

    public static WebDriver driver;
    public static ChromeOptions options;

    String url = "https://www.saucedemo.com/v1/";

    public BrowserDriver() {

        options = new ChromeOptions();
        System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
        options.setPageLoadTimeout(Duration.ofSeconds(60));
        this.driver = new ChromeDriver();
        driver.get(url);
    }

    public void close(){
        this.driver.quit();
    }
}


