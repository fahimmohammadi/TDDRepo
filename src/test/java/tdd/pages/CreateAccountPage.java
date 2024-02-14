package tdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tdd.utility.seleniumUtilities;

public class CreateAccountPage extends seleniumUtilities {
    public CreateAccountPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(className = "login__account-btn")
    public WebElement createAccountButton;
    @FindBy(name="name")
    public WebElement nameInput;
    @FindBy(name="email")
    public WebElement emailInput;
    @FindBy(name="password")
    public WebElement passwordInput;
    @FindBy(name = "confirmPassword")
    public WebElement confirmPasswordInput;
    @FindBy(id="signupBtn")
    public WebElement signupButton;
    @FindBy(className = "account__information-email")
    public WebElement emailText;
    @FindBy(className = "error")
    public WebElement errorText;

}
