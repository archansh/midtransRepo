package midtrans.test;

import midtrans.pages.BasePage;
import midtrans.setup.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckoutFlow {
    BaseTest baseTest=new BaseTest();
    BasePage basePage=new BasePage();
    @BeforeTest
    public void setUp(){
        baseTest.initializeBrowser();
        baseTest.getUrl("url");
    }
    @Test
    public void buy_product1(){
       // basePage.clickOnBuyButtonBuyNow();
        System.out.println("this is buy_product1");
    }

    @Test
    public void buy_product2(){
        // basePage.clickOnBuyButtonBuyNow();
        System.out.println("this is buy_product2");
        int num=10/0;
        System.out.println("num = "+num);
    }

    @Test
    public void buy_product3(){
        // basePage.clickOnBuyButtonBuyNow();
        System.out.println("this is buy_product3");
    }
    @AfterTest
    public void tearDown(){

        baseTest.closeBrowser();
    }
}
