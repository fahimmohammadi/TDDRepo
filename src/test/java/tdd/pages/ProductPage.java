package tdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tdd.utility.seleniumUtilities;

public class ProductPage extends seleniumUtilities {
    public ProductPage(){
        PageFactory.initElements(getDriver(),this);
    }
    @FindBy(className = "search__input")
    public WebElement SearchInput;
    @FindBy(className = "search__btn")
    public WebElement SearchButton;
    @FindBy(className = "products__name")
    public WebElement ProductTV;
    @FindBy(id = "addToCartBtn")
    public WebElement addToCartButton;
    @FindBy(className = "top-nav__btn top-nav__cart")
    public WebElement cartButton;
    @FindBy(className = "cart__item-product-name")
    public WebElement ItemInCart;
    @FindBy(className = "cart__item-delete")
    public WebElement DeleteItem;



}
