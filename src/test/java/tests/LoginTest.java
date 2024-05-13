package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("loginUrl"));
        loginPage.mail.sendKeys(ConfigReader.getProperty("mailAddress"));
        loginPage.toContinue.click();
        loginPage.password.sendKeys(ConfigReader.getProperty("mailPassword"));
        loginPage.signIn.click();

    }
}
