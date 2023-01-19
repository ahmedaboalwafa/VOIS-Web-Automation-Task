package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Payment_Page {
    private WebDriver driver;
    private Wait wait;
    private By payByBankWare = By.xpath("//a[@title='Pay by bank wire']");
    private By confirmOrder = By.xpath("//button[@class='button btn btn-default button-medium']");
    private By backToOrder = By.xpath("//a[@class='button-exclusive btn btn-default']");
    private By referanceCode = By.xpath("//div[@class='box']");
    private String refCode;


    public Payment_Page(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public History_Page navigateToHistory(){
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(payByBankWare)));
        driver.findElement(payByBankWare).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(confirmOrder)));
        driver.findElement(confirmOrder).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(backToOrder)));
        refCode = driver.findElement(referanceCode).getText();
        driver.findElement(backToOrder).click();
        return new History_Page(driver);
    }

    public String getReferanceCode(){
        return refCode;
    }
}
