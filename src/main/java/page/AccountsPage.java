package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage {

    WebDriver driver;

    public AccountsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id= "nav-accounts")
    WebElement accountButton;

    @FindBy(xpath = "//*[text()='$7,500.00']")
    WebElement accountsBalance;

    @FindBy(xpath = "//table/tbody/tr")
    WebElement activeAccounts;

    public void clickAccountButton(){
        accountButton.click();
    }
    public double getAccountsBalance() {
        String balance = accountsBalance.getText();
        System.out.println("Account Page Balance : "+balance);
        balance = balance.replace("$", "").replace(",", "").trim();
        return Double.parseDouble(balance);
    }
    public int getAccountsCount() {
        activeAccounts.getSize();
        return getAccountsCount();
    }
}