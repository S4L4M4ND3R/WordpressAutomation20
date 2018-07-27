package tests;

import constants.AdminUser;
import org.junit.Assert;
import pageobjects.HeaderObject;
import pageobjects.LoginPage;
import core.TestBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageobjects.ReaderPage;
import pageobjects.UserDetailsPage;

public class LoginTests extends TestBase {

    @Before
    public void beforeEach(){
        driver.get("https://wordpress.com/log-in");
    }

    @Test
    public void loginAdmin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(AdminUser.USERNAME);
        loginPage.submitUsername();
        loginPage.enterPassword(AdminUser.PASSWORD);
        ReaderPage readerPage = loginPage.login();
        HeaderObject headerObject = new HeaderObject(driver);
        UserDetailsPage userDetailsPage = headerObject.userDetailsPage();

        Assert.assertTrue("Wrong user was loged in.", userDetailsPage.getUsername().contains("foxyka15001"));

        Thread.sleep(3000);
    }

    @After
    public void afterEach(){
        driver.close();
    }

}
