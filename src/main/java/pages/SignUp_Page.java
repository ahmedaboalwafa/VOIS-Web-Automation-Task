package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUp_Page {
    private WebDriver driver;
    private Wait<WebDriver> wait;
    private By mrRadio = By.xpath("//input[@id='id_gender1']");
    private By CFirstName = By.id("customer_firstname");
    private By CLastName = By.id("customer_lastname");
    private By generatePassword = By.id("passwd");
    private By day_BOD = By.id("days");
    private By month_BOD = By.id("months");
    private By years_BOD = By.id("years");



    private By registerBTN = By.id("submitAccount");

    public SignUp_Page(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public MyAccount_Page signUp(String FirstName,String LastName,String Password) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(3));
        driver.findElement(mrRadio).click();
        driver.findElement(CFirstName).sendKeys(FirstName);
        driver.findElement(CLastName).sendKeys(LastName);
        driver.findElement(generatePassword).sendKeys(Password);
        Select days = new Select(driver.findElement(day_BOD));
        days.selectByValue("5");
        Select months = new Select(driver.findElement(month_BOD));
        months.selectByValue("5");
        Select years = new Select(driver.findElement(years_BOD));
        years.selectByValue("1996");
        driver.findElement(registerBTN).click();

        return new MyAccount_Page(driver);
    }
}
