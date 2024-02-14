package tdd.tests.regression;

import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.base.UITestsBase;
import tdd.pages.AccountPage;
import tdd.pages.HomePage;
import tdd.pages.LoginPage;

public class AccountPageTests extends UITestsBase {
//Story 5: navigate to retail app and login with your credential
//Navigate to account page and update Name and phone number.
//Validate your phone number and Name Updated.
//Validate Success toast message displayed.
    @Test
    public void loinWithCredentialAndUpdateNameAndPhoneNumber(){
        HomePage homePage=new HomePage();
        clickONElement(homePage.SignInButton);
        LoginPage loginPag=new LoginPage();
        sendTextToElement(loginPag.emailInput,"mohammadifahimkhan@gmail.com");
        sendTextToElement(loginPag.passwordInput,"King078564@");
        clickONElement(loginPag.loginButton);
        AccountPage accountPage=new AccountPage();
        clickONElement(accountPage.accountButton);
        removeText(accountPage.NameInput);
        sendTextToElement(accountPage.NameInput,"Mohammadi Fahim");
        removeText(accountPage.phoneNUmberInput);
        sendTextToElement(accountPage.phoneNUmberInput,"5872576115");
        clickONElement(accountPage.updateButton);
        String ToastMessage=getElementText(accountPage.ToastMessage);
        Assert.assertEquals(ToastMessage,"Personal Information Updated Successfully",
                "validate toast message displayed");


    }
//Story 6: Navigate to Retail and login with your credential.
//Navigate to Account profile and change your password.
//Validate Success Message toast displayed.
@Test
public void loginWithCredentialAndChangePassword(){
    HomePage homePage=new HomePage();
    clickONElement(homePage.SignInButton);
    LoginPage loginPag=new LoginPage();
    sendTextToElement(loginPag.emailInput,"mohammadifahimkhan@gmail.com");
    sendTextToElement(loginPag.passwordInput,"King078564#");
    clickONElement(loginPag.loginButton);
    AccountPage accountPage=new AccountPage();
    clickONElement(accountPage.accountButton);
    sendTextToElement(accountPage.previousPassword,"King078564#");
    sendTextToElement(accountPage.newPassword,"King078564$");
    sendTextToElement(accountPage.confirmPassword,"King078564$");
    clickONElement(accountPage.changePasswordButton);
    String passwordTestMessage=getElementText(accountPage.passwordToastMessage);
    Assert.assertEquals(passwordTestMessage,"Password Updated Successfully", "password toast message validate");

}
//Story 7: Navigate to Retail app and in landing page search for a product.
//Validate searched products display on the page.
@Test
public void validateSearchProduct(){

}


}
