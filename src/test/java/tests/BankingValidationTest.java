package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Base;
import page.AccountsPage;
import page.DashboardPage;
import page.LoginPage;
import utils.ConfigReader;

public class BankingValidationTest extends Base {

    @BeforeMethod
    public void setUp(){
        LoginPage login = new LoginPage(driver);
        ConfigReader config = new ConfigReader();
        login.login(config.getProperty("username"), config.getProperty("password"));
    }
    @Test(priority = 1)
    public void validateTotalBalance() {

        DashboardPage dashboard = new DashboardPage(driver);
        AccountsPage accounts = new AccountsPage(driver);
        Assert.assertEquals(dashboard.getTotalBalance(),accounts.getAccountsBalance());
    }
}