package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.PrimitiveIterator;

public class UserDetailsPage extends BasePage{


    @FindBy(css = "[class='profile-gravatar__user-display-name']")
    protected WebElement username;

    public UserDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String getUsername(){
        String text = username.getText();
        return text;
    }

}
