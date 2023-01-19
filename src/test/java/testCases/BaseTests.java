package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import static Utilities.Configuration_Data_Reader.getConfigData;

public class BaseTests {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        if (getConfigData("Browser").equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (getConfigData("Browser").equals("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.navigate().to(getConfigData("URL"));
        driver.manage().window().setSize(new Dimension(1024,768));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
