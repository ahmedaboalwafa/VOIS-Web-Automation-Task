package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Categories_Page{
    private WebDriver driver;
    private Wait wait;
    private Actions actions;
    private By BTNContainer = By.className("right-block");
    private By addToCardBTN = By.xpath("//a[@title='Add to cart']");
    private By categuryProceedToCheckout = By.xpath("//a[@title='Proceed to checkout']");

    public Categories_Page(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new Actions(driver);
    }

    public Summary_Page navigateToSummaryPage(){
        actions.moveToElement(driver.findElement(BTNContainer)).moveToElement(driver.findElement(addToCardBTN)).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(categuryProceedToCheckout)));
        driver.findElement(categuryProceedToCheckout).click();
        return new Summary_Page(driver);
    }

}
