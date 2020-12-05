package midtrans.test;

import midtrans.setup.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckoutFlow {
    BaseTest bt=new BaseTest();
    @BeforeTest
    public void setUp(){
        bt.initializeBrowser();
        bt.getUrl("url");
    }
    @Test
    public void buy_product(){

    }
    @AfterTest
    public void tearDown(){
        bt.closeBrowser();
    }
}
