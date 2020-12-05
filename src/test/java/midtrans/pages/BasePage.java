package midtrans.pages;

import midtrans.setup.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage extends BaseTest {

    @FindBy(xpath = "//a[contains(text(),'BUY NOW')]")
    WebElement button_buynow;

    public void clickOnButButtonBuyNow() {
        button_buynow.click();
    }
}
