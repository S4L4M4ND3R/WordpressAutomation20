package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BasePage;
import sun.rmi.runtime.Log;

public class LoginPage extends BasePage {

    @FindBy(css = "[id='usernameOrEmail']")
    private WebElement username_field;

    @FindBy(css = "[id='password']")
    private WebElement password_field;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submit_username;

    @FindBy(xpath = "//button[@type='submit']")
    private  WebElement login_button;

    //private WebElement username_field = driver.findElement(By.cssSelector("[id='usernameOrEmail']"));

    public LoginPage(WebDriver driver) {
        super(driver);
        isLoaded();
    }

    @Override
    protected void isLoaded() {
        //waitForElementToAppear(username_field, "Username field should be displayed");
        //waitForElementToAppear(submit_username, "Submit username button should be displayed.");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void enterUsername(String username){
        username_field.click();
        username_field.sendKeys(username);
    }

    public void submitUsername(){
        submit_username.click();
    }

    public void enterPassword(String password) {
        isLoaded();
        password_field.click();
        password_field.sendKeys(password);
    }


    public ReaderPage login() {
        login_button.click();
        return new ReaderPage(driver);
    }
}
