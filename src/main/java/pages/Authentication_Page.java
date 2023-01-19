package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Authentication_Page {
    private WebDriver driver;
    private By emailCreate = By.id("email_create");
    private By submitCreateBTN = By.id("SubmitCreate");
    private By loginEmail = By.id("email");
    private By loginPassword = By.id("passwd");
    private By loginBTN = By.id("SubmitLogin");

    public Authentication_Page(WebDriver driver){
        this.driver = driver;
    }
    public SignUp_Page navigateToSignUpPage(String Email){
        driver.findElement(emailCreate).sendKeys(Email);
        driver.findElement(submitCreateBTN).click();
        return new SignUp_Page(driver);
    }
    public MyAccount_Page Signin(String Email,String Password){
        driver.findElement(loginEmail).sendKeys(Email);
        driver.findElement(loginPassword).sendKeys(Password);
        driver.findElement(loginBTN).click();
        return new MyAccount_Page(driver);
    }
}
