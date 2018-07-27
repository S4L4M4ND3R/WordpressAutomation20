package core;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;

    public static final int DEFAULT_WAIT = 10;

    public TestBase() {                                                                         //creating a basic test class with the setup driver for the tests to be able to manipulate
        this.driver = DriverFactory.getInstance().getWebDriver();                               //with the page
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
