package gradle.test.demo.factory;

import org.openqa.selenium.WebDriver;

import static gradle.test.demo.factory.ChromeBrowser.initChromeBrowser;

public class BrowserFactory {
    public static WebDriver driver = initBrowser();

    static WebDriver initBrowser() {
        String browser = System.getProperty("browser");
        if (browser != null) {
            switch (browser) {
                case "edge":
                    System.out.println("Edge not implemented yet");
                    System.exit(0);
                case "safari":
                    System.out.println("Safari not implemented yet");
                    System.exit(0);
                case "firefox":
                    System.out.println("Firefox not implemented yet");
                    System.exit(0);
                case "chrome":
                default:
                    return initChromeBrowser();
            }
        } else {
            throw new RuntimeException("No browser defined in system property! Please add -Dbrowser=browsername in VM options");
        }
    }

    public static void driverQuit() {
        driver.quit();
    }
}
