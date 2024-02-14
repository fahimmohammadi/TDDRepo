package tdd.tests.regression;

import org.testng.Assert;
import org.testng.annotations.Test;
import tdd.base.UITestsBase;
import tdd.pages.HomePage;
import tdd.pages.LoginPage;
import tdd.pages.ProductPage;

public class ProductTests extends UITestsBase {
    //Story 8: Navigate to Retail App and login with your credentials.
    //Search for TV and Add TV to the card
    //Navigate to Cart and make sure 1 Item display at your card.
    //Delete cart item.
    //Validate Item deleted.
    @Test
    public void validateProductAdditionIntoCart(){
        HomePage homePage = new HomePage();
        clickONElement(homePage.SignInButton);

        LoginPage loginPage = new LoginPage();
        sendTextToElement(loginPage.emailInput,"fahimkhanmohammadi@gmail.com");
        sendTextToElement(loginPage.passwordInput,"King078564@");
        clickONElement(loginPage.loginButton);
        ProductPage productPage = new ProductPage();
        sendTextToElement(productPage.SearchInput,"Amazon Fire TV");
        clickONElement(productPage.SearchButton);
        clickONElement(productPage.ProductTV);
        clickONElement(productPage.addToCartButton);
        String itemsNameText=getElementText(productPage.ItemInCart);
        Assert.assertEquals(itemsNameText,"Amazon Fire TV","Validate item in the cart available");
        clickONElement(productPage.DeleteItem);
        String itemName=getElementText(productPage.ItemInCart);
        Assert.assertEquals(itemsNameText,"Amazon Fire TV", "Validate item is not available in the cart")
        ;
    }
}
