package midtrans.test;

import midtrans.pages.BasePage;
import midtrans.setup.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckoutFlow4 {
    BaseTest baseTest=new BaseTest();
    BasePage basePage=new BasePage();
    @BeforeTest
    public void setUp(){
        baseTest.initializeBrowser();
        baseTest.getUrl("url");
    }
    @Test
    public void cart_product1(){
       // basePage.clickOnBuyButtonBuyNow();
        System.out.println("this is cart_product1");
    }

    @Test
    public void cart_product2(){
        // basePage.clickOnBuyButtonBuyNow();
        System.out.println("this is cart_product2");
    }

    @Test
    public void cart_product3() throws InterruptedException {
        // basePage.clickOnBuyButtonBuyNow();
        System.out.println("this is cart_product3");
        Thread.sleep(10000);
    }

    @AfterTest
    public void tearDown(){

        baseTest.closeBrowser();
    }
}
