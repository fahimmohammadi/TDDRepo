package tdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import tdd.utility.seleniumUtilities;

public class AccountPage extends seleniumUtilities {

public AccountPage(){
    PageFactory.initElements(getDriver(),this);
}
    @FindBy(id = "accountLink")
    public WebElement accountButton;
   @FindBy(id = "nameInput")
   public WebElement NameInput;
   @FindBy(name = "phoneNumber")
   public WebElement phoneNUmberInput;
   @FindBy(className = "Toastify")
   public WebElement ToastMessage;
   @FindBy(id = "personalUpdateBtn")
    public WebElement updateButton;
    @FindBy(name="previousPassword")
    public WebElement previousPassword;
    @FindBy(name = "newPassword")
    public WebElement newPassword;
    @FindBy(name="confirmPassword")
    public WebElement confirmPassword;
    @FindBy(id= "credentialsSubmitBtn")
    public WebElement changePasswordButton;
    @FindBy(xpath = "/html/body/div/div[2]/div/div/div[1]/div[2]")
    public WebElement passwordToastMessage;
}
