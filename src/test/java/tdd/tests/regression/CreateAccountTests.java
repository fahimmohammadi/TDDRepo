package tdd.tests.regression;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.base.UITestsBase;
import tdd.pages.CreateAccountPage;
import tdd.pages.HomePage;
import tdd.pages.LoginPage;

public class CreateAccountTests extends UITestsBase {

  //Story 4: Navigate to Create Account page and Create new Account
  //Validate New Account Created.
  @Test
  public void validateAccountCreation() {
  HomePage homePage = new HomePage();
  clickONElement(homePage.SignInButton);
      CreateAccountPage createAccountPage = new CreateAccountPage();
      clickONElement(createAccountPage.createAccountButton);
      sendTextToElement(createAccountPage.nameInput,"Fahim Khan Mohammadi");
      sendTextToElement(createAccountPage.emailInput,"mohammadifahimkhan@gmail.com");
      sendTextToElement(createAccountPage.passwordInput,"King078564@");
      sendTextToElement(createAccountPage.confirmPasswordInput,"King078564@");
      clickONElement(createAccountPage.signupButton);
      String emailText=getElementText(createAccountPage.emailText);
      Assert.assertEquals(emailText,"mohammadifahimkhan@gmail.com","validate account is created successfully");
  }
//Navigate to Create Account page and Create new Account
//With existing email and validate error message
// "this email is already exist, please use another email address".
@Test
public void validateCreatingAccountWithExistingEmail(){
    HomePage homePage = new HomePage();
    clickONElement(homePage.SignInButton);
    CreateAccountPage createAccountPage = new CreateAccountPage();
    clickONElement(createAccountPage.createAccountButton);
    sendTextToElement(createAccountPage.nameInput,"Fahim Khan Mohammadi");
    sendTextToElement(createAccountPage.emailInput,"mohammadifahimkhan@gmail.com");
    sendTextToElement(createAccountPage.passwordInput,"King078564@");
    sendTextToElement(createAccountPage.confirmPasswordInput,"King078564@");
    clickONElement(createAccountPage.signupButton);
    String errorText=getElementText(createAccountPage.errorText);
    Assert.assertEquals(errorText,"this email is already exist, please use another email address","validate this email is already exist error message");
}

}
