package midtrans.pages;

import midtrans.setup.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BaseTest {
    public BasePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'BUY NOW')]")
    WebElement button_buynow;

    public void clickOnBuyButtonBuyNow() {
        button_buynow.click();
    }
}
