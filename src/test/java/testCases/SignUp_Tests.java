package testCases;

import org.testng.annotations.Test;
import pages.Home_Page;

import static Utilities.Configuration_Data_Reader.getConfigData;
import static org.testng.Assert.assertTrue;

public class SignUp_Tests extends BaseTests {
    @Test
    public void createNewAccount() throws InterruptedException {
        Home_Page homePage = new Home_Page(driver);
        String WelcomeMSG = homePage.clickOnSignipButton().navigateToSignUpPage(getConfigData("Email")).
                signUp(getConfigData("FirstName"),getConfigData("LastName"),getConfigData("Password")).ReturnWelcomeMessage();

        assertTrue(WelcomeMSG.contains("Welcome to your account"));
    }

}
