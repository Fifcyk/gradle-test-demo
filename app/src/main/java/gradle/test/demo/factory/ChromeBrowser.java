package gradle.test.demo.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static gradle.test.demo.utils.ConfigFileReader.getProperty;

public class ChromeBrowser {

    public static WebDriver initChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", getProperty("CHROME_DRIVER_PATH"));
        ChromeOptions options = new ChromeOptions();
        return new ChromeDriver(options);
    }
}
