package tdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tdd.utility.seleniumUtilities;

public class HomePage extends seleniumUtilities {
    //Constructor is used to Initialize instance of driver  to instance elements of that Java Class.
    public HomePage() {
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(className = "top-nav__logo")
    public WebElement homePageTitle;
    @FindBy(id = "signinLink")
    public WebElement SignInButton;

    @FindBy(id="accountLink")
    public WebElement accountLinkButton;

    @FindBy(id="newAccountBtn")
    public WebElement CreateNewAccountButton;
}


