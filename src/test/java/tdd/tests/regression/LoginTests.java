package tdd.tests.regression;

import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.base.UITestsBase;
import tdd.pages.HomePage;
import tdd.pages.LoginPage;

public class LoginTests extends UITestsBase {
    //User Story 1: Navigate to retail app sign in badge and sign in with valid username and password.
//Validate user successfully signed in.
    @Test
    public void validateSuccessfullyLogin() {
        HomePage homePage = new HomePage();
        clickONElement(homePage.SignInButton);

        LoginPage loginPage = new LoginPage();
        sendTextToElement(loginPage.emailInput,"fahimkhanmohammadi@gmail.com");
        sendTextToElement(loginPage.passwordInput,"King078564@");
        clickONElement(loginPage.loginButton);
        boolean isAccountLinkButtonDisplayed = isElementDisplayed(homePage.accountLinkButton);
        Assert.assertTrue(isAccountLinkButtonDisplayed,"Account Link button should be displayed after successful login");
    }

    //User Story 2: Navigate to sign in page and sign in with Invalid username and valid password.
//Validate error message displays "wrong username or password"
    @Test
    public void validateErrorMessageDisplayedWithInvalidUsername() {
        HomePage homePage = new HomePage();
        clickONElement(homePage.SignInButton);

        LoginPage loginPage = new LoginPage();
        sendTextToElement(loginPage.emailInput,"wrongemail@gmail.com");
        sendTextToElement(loginPage.passwordInput,"King078564@");
        clickONElement(loginPage.loginButton);
        String errorMessage = getElementText(loginPage.errorMessage);
        Assert.assertEquals(errorMessage,"wrong username or password","Error message should be displayed");
    }

//User Story 3: Navigate to sign in page and sign in with valid user and invalid password
//Validate error message display  "wrong username or password"

    @Test
    public void validateErrorMessageDisplayedWithInvalidPassword() {
        HomePage homePage = new HomePage();
        clickONElement(homePage.SignInButton);
        LoginPage loginPage = new LoginPage();
        sendTextToElement(loginPage.emailInput,"fahimkhanmohammadi@gmail.com");
        sendTextToElement(loginPage.passwordInput,"wrongPassword");
        clickONElement(loginPage.loginButton);
        String errorMessage = getElementText(loginPage.errorMessage);
        Assert.assertEquals(errorMessage,"wrong username or password","Error message should be displayed ");
    }

//Story 4: Navigate to Create Account page and Create new Account
//Validate New Account Created.

    @Test
    public void validateAccountCreatedSuccessfully() {
    HomePage homePage = new HomePage();
    clickONElement(homePage.SignInButton);

    }


}








