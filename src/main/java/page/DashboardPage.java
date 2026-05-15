package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[text()='$7,500.00']")
    WebElement totalBalance;

    @FindBy(xpath = "//*[text()='2']")
    WebElement activeAccont;

    @FindBy(xpath = "//*[text()='1']")
    WebElement totalTransactions;

    public double getTotalBalance(){
        String balance = totalBalance.getText();
        System.out.println("Dashboard Page Balance : "+balance);
        balance = balance.replace("$", "").replace(",", "").trim();
        return Double.parseDouble(balance);
    }
    public void getActiveAccont(){
        activeAccont.getText();
    }
    public void getTotalTransactions(){
        totalTransactions.getText();
    }
}
