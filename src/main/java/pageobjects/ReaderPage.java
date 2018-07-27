package pageobjects;

import org.openqa.selenium.WebDriver;

public class ReaderPage extends BasePage {

    HeaderObject headerObject;

    public ReaderPage(WebDriver driver) {
        super(driver);
        headerObject = new HeaderObject(driver);
    }

}
