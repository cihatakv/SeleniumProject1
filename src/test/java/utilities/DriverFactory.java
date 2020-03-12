package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver createADriver(String browserName) {
        if (browserName.equalsIgnoreCase("Chrome")) {
            // to Fix [1583367588.761][SEVERE]: Timed out receiving message from renderer: 0.100
            WebDriverManager.chromedriver().version("79.0").setup();
            return new ChromeDriver();
        } else {
            browserName.equalsIgnoreCase("firefox");
            return new FirefoxDriver();
        }
    }
}
