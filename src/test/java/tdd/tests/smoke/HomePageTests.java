package tdd.tests.smoke;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.base.UITestsBase;
import tdd.pages.HomePage;

public class HomePageTests extends UITestsBase {
    //TestCase Navigate to retail app and validate top-left corner Text is TEKSCHOOL

    @Test
    public void validatePageTitle(){
       HomePage homepage = new HomePage();
       String homePageTitle=getElementText(homepage.homePageTitle);
       Assert.assertEquals(homePageTitle,"TEKSCHOOL","validate top left corner title");
    }

    //TestCase Navigate to retail app and make sure Sign in button is enabled.

    @Test
    public void validateSignInButtonEnabled(){
        HomePage homePage = new HomePage();
        boolean isSignInButtonEnabled = isElementEnabled(homePage.SignInButton);
        Assert.assertTrue(isSignInButtonEnabled,"Sign in button should be enabled");
    }
}
