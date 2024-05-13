package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductPage {

    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "sp-cc-rejectall-link")
    public WebElement cookies;
    @FindBy(xpath = "(//*[@id='twotabsearchtextbox'])[1]")
            public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='a-section a-spacing-base'])[3]")
    public WebElement selectedProduct;

    @FindBy(xpath = "(//*[@id='add-to-cart-button'])[1]")
    public WebElement addToCart;

    @FindBy(name = "proceedToRetailCheckout")
    public WebElement proceedToCheckout;





}
