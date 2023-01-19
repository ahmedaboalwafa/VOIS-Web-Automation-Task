package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class History_Page {
    private WebDriver driver;
    private By latestRefCode = By.xpath("//a[@class='color-myaccount']");

    public History_Page(WebDriver driver){
        this.driver = driver;
    }

    public String getRefCodeFromHistory(){
        return driver.findElements(latestRefCode).get(0).getText();
    }

}
