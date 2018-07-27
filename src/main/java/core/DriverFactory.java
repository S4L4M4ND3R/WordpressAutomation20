package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    String browser;

    public DriverFactory() {
        this.browser = "chrome";
    }

    private static DriverFactory instance = new DriverFactory();

    public static DriverFactory getInstance() {
        return instance;
    }

    public WebDriver getWebDriver(){

        if (this.browser == "chrome"){
            String browserPath = "C:\\Users\\saboa\\IdeaProjects\\WordpressAutomation20\\src\\main\\resources\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", browserPath);
            return new ChromeDriver();
        }

        if (this.browser == "firefox"){
            String browserPath = "C:\\Users\\saboa\\IdeaProjects\\WordpressAutomation20\\src\\main\\resources\\geckodriver.exe";
            System.setProperty("webdriver.chrome.driver", browserPath);
            return new FirefoxDriver();
        }

        return null;
    }
}
