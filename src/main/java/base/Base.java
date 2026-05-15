package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.DriverFactory;

public class Base {

    public WebDriver driver;

    ConfigReader config=new ConfigReader();
    @BeforeMethod
    public void setup(){

        driver = DriverFactory.initBrowser(config.getProperty("browser"));
        driver.get(config.getProperty("url"));
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
