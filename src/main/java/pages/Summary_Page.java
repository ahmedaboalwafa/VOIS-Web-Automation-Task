package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Summary_Page {
    private WebDriver driver;
    private Wait wait;
    private By summaryProceedToCheckout = By.xpath("//a[@title='Proceed to checkout']");

    public Summary_Page(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    public Address_Page navigateToAddressPage(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(summaryProceedToCheckout).get(1)));
        driver.findElements(summaryProceedToCheckout).get(1).click();
        return new Address_Page(driver);
    }
}
