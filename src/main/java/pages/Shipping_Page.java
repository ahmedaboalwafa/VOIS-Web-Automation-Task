package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Shipping_Page {
    private WebDriver driver;
    private Wait wait;
    private By termsCheckBox = By.id("cgv");
    private By shippingProceedToCheckout = By.name("processCarrier");

    public Shipping_Page(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public Payment_Page navegateToPaymentPage(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(shippingProceedToCheckout)));
        driver.findElement(termsCheckBox).click();
        driver.findElement(shippingProceedToCheckout).click();
        return new Payment_Page(driver);
    }
}
