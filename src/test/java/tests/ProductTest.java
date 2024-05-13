package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.ProductPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ProductTest {
    /*
  Tarayıcıyı başlatın.
Amazon Türkiye e-ticaret sitesine gidin ("https://www.amazon.com.tr/").
Arama kutusuna bir ürün adı yazın ve arama yapın. Örneğin, "klavye".
Arama sonuçları arasından bir ürünü seçin ve ürün sayfasına gidin.
Ürün sayfasında bulunan "Sepete Ekle" düğmesine tıklayarak ürünü sepete ekleyin.
Satın alma işlemini başlatmak için ödeme sayfasına gidin.
Kargo bilgilerini doldurun.
Tarayıcıyı kapatın.
   */
    WebDriver driver = Driver.getDriver();

    ProductPage productPage = new ProductPage();

    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

//        productPage.cookies.click();
        productPage.searchBox.sendKeys("klavye", Keys.ENTER);
        productPage.selectedProduct.click();
        productPage.addToCart.click();
        productPage.proceedToCheckout.click();


    }
}
