package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
    private WebDriver driver;
    private By signipBTN = By.partialLinkText("Sign in");

    public Home_Page(WebDriver driver){
        this.driver = driver;
    }

    public Authentication_Page clickOnSignipButton(){
        driver.findElement(signipBTN).click();
        return new Authentication_Page(driver);
    }
}
