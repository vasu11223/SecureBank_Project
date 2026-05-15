package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.Base;
import page.LoginPage;
import utils.ConfigReader;

public class BankingValidationTest extends Base {

    @Test
    public void validateTotalBalance() {
        LoginPage login = new LoginPage(driver);
        ConfigReader config = new ConfigReader();
        login.login(config.getProperty("username"), config.getProperty("password"));
    }

}