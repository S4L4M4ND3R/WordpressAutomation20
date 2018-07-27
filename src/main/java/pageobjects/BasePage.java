package pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage extends LoadableComponent<BasePage> {

    protected WebDriver driver;
    protected WebDriverWait webDriverWait;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);         //to be able to use PageFactory notation
    }

    protected final boolean isPresent(WebElement element){
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException| StaleElementReferenceException e){
            return false;
        }
    }

    protected final void waitForElementToAppear(WebElement webElement, String errorMessage) {
        try {
            driver.wait(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected final void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void isLoaded() {
        throw new AssertionError(
                "The page's static component test code is not working. Pls implement it by overwriting this function");
    }

    @Override
    protected void load() {
    }

}
