package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.time.Duration;

public class MyAccount_Page {
    private WebDriver driver;
    private Wait wait;
    private By welcomeMSG = By.className("info-account");
    private By womanSection = By.xpath("//a[@title='Women']");
    private By Blouses = By.xpath("//a[@title='Blouses']");
    private Actions actions;
    public MyAccount_Page(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new Actions(driver);
    }
    public String ReturnWelcomeMessage(){return driver.findElement(welcomeMSG).getText();}
    public Categories_Page chooseCategory(){
        //wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(womanSection)));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        actions.moveToElement(driver.findElement(womanSection)).moveToElement(driver.findElement(Blouses)).click().perform();
        return new Categories_Page(driver);
    }
}

