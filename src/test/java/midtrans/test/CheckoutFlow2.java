package midtrans.test;

import midtrans.pages.BasePage;
import midtrans.setup.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckoutFlow2 {
    BaseTest baseTest=new BaseTest();
    BasePage basePage=new BasePage();
    @BeforeTest
    public void setUp(){
        baseTest.initializeBrowser();
        baseTest.getUrl("url");
    }
    @Test
    public void launch_product1(){
       // basePage.clickOnBuyButtonBuyNow();
        System.out.println("this is launch_product1");
    }

    @Test
    public void launch_product2(){
        // basePage.clickOnBuyButtonBuyNow();
        System.out.println("this is launch_product2");
    }

    @Test
    public void launch_product3(){
        // basePage.clickOnBuyButtonBuyNow();
        System.out.println("this is launch_product3");
    }
    @AfterTest
    public void tearDown(){

        baseTest.closeBrowser();
    }
}
