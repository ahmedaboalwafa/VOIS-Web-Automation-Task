package testCases;

import org.testng.annotations.Test;
import pages.*;

import static Utilities.Configuration_Data_Reader.getConfigData;
import static org.testng.Assert.assertTrue;

public class MakeAnOrder_Tests extends BaseTests{

    @Test
    public void signIn(){
        Home_Page homePage = new Home_Page(driver);
        String WelcomeMSG = homePage.clickOnSignipButton().Signin(getConfigData("Email"),getConfigData("Password"))
                .ReturnWelcomeMessage();
        assertTrue(WelcomeMSG.contains("Welcome to your account"));
    }

    @Test(dependsOnMethods = {"signIn"})
    public void makeAnOrder(){

        MyAccount_Page myAccount_page = new MyAccount_Page(driver);
        Payment_Page payment_page =myAccount_page.chooseCategory().navigateToSummaryPage().navigateToAddressPage()
                .navigateToShippingPage(getConfigData("Company"),getConfigData("Address"),getConfigData("City"),
                        getConfigData("Postcode"),getConfigData("AdditionalInfo"),
                        getConfigData("MobilePhone"),getConfigData("AddressAliasFFR")).navegateToPaymentPage();

        String historyRefCode=payment_page.navigateToHistory().getRefCodeFromHistory();
        String referanceCode = payment_page.getReferanceCode();
        assertTrue(referanceCode.contains(historyRefCode));

    }
}
