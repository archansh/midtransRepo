package midtrans.setup;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
//import org.testng.log4testng.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

    public class BaseTest {
        static Properties  prop = new Properties();
        public static WebDriver driver;
        static Logger logger = LogManager.getLogger(BaseTest.class);

        public BaseTest(){
            PageFactory.initElements(driver, this);
            try {
                FileInputStream file = new FileInputStream("C:\\Users\\Piyush Verma\\IdeaProjects\\midtransRepo\\resources\\testdata\\config.properties");
                prop.load(file);
            } catch(FileNotFoundException e) {
                logger.error(e);
            } catch(IOException e1) {
                logger.error(e1);
            }
        }


        public void getUrl(String url){
            logger.info("launching application with given url" );
            driver.get(prop.getProperty(url));
            logger.info("launched application successfully" );
        }

        public static void closeBrowser(){
            logger.info("closing browser after test execution" );
            driver.close();
            logger.info("browser closed successfully" );
        }

        public static void initializeBrowser(){
            String browserName = prop.getProperty("browserName");
            logger.info("initializing setup for text execution" );
            if (browserName.equalsIgnoreCase("chrome")){
                System.out.println("I am Checking Chrome Browser");
                logger.info("opening chrome browser" );
                System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                logger.info("maximised chrome browser" );
            }else if (browserName.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.chrome.driver", "resources/driver/geckodriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            } else {
                logger.info("invalid browser name provided - test execution failed");
            }
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }