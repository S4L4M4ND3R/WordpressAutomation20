package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.jws.soap.SOAPBinding;

public class HeaderObject extends BasePage {

    @FindBy(css = "[href='/me']")
    private WebElement user_details;

    public HeaderObject(WebDriver driver) {
        super(driver);
    }

    public UserDetailsPage userDetailsPage(){
        user_details.click();
        return new UserDetailsPage(driver);
    }
}
