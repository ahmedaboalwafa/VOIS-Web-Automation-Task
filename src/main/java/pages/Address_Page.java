package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Address_Page {
    private WebDriver driver;
    private Wait wait;

    private By company = By.id("company");
    private By address = By.id("address1");
    private By city = By.id("city");
    private By state = By.id("id_state");
    private By postcode = By.id("postcode");
    private By country = By.id("id_country");
    private By additionalInfo = By.id("other");

    private By HomePhone = By.id("phone");
    private By mobilePhone = By.id("phone_mobile");
    private By addressAliasFFR = By.id("alias");

    private By SaveBTN = By.id("submitAddress");
    private By addressProceedToCheckout = By.name("processAddress");
    public Address_Page(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public Shipping_Page navigateToShippingPage(String Company, String Address,String City,
                                                String Postcode,String AdditionalInfo,String mobile,String AddressAliasFFR){
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(SaveBTN)));
        driver.findElement(company).sendKeys(Company);
        driver.findElement(address).sendKeys(Address);
        driver.findElement(city).sendKeys(City);
        Select states = new Select(driver.findElement(state));
        states.selectByValue("1");
        driver.findElement(postcode).sendKeys(Postcode);
        Select countries = new Select(driver.findElement(country));
        countries.selectByValue("21");
        driver.findElement(additionalInfo).sendKeys(AdditionalInfo);
        driver.findElement(HomePhone).sendKeys(mobile);
        driver.findElement(mobilePhone).sendKeys(mobile);
        driver.findElement(addressAliasFFR).sendKeys(AddressAliasFFR);
        driver.findElement(SaveBTN).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(addressProceedToCheckout)));
        driver.findElement(addressProceedToCheckout).click();
        return new Shipping_Page(driver);
    }
}
