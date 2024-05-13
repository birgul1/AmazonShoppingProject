package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='ap_email']")
    public WebElement mail;

    @FindBy(xpath = "//*[@id='ap_password']")
    public WebElement password;

    @FindBy(xpath = "//span[@id='continue']")
    public WebElement toContinue;

    @FindBy(id = "signInSubmit")
    public WebElement signIn;
}
