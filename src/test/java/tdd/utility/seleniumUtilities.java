package tdd.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tdd.base.BaseSetup;

import java.time.Duration;

public class seleniumUtilities extends BaseSetup {
    public WebDriverWait getWait(){
        return new WebDriverWait(getDriver(),Duration.ofSeconds(10));
    }
    public WebElement waitForVisibility(WebElement element){
        return getWait().until(ExpectedConditions.visibilityOf(element));
    }
    public String getElementText(WebElement element){
       return waitForVisibility(element).getText();
    }
    public boolean isElementEnabled(WebElement element){
        return waitForVisibility(element).isEnabled();
    }
    public void clickONElement(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public void sendTextToElement(WebElement element, String text){
        waitForVisibility(element).sendKeys(text);
        }
    public boolean isElementDisplayed(WebElement element){
        return waitForVisibility(element).isDisplayed();
    }
    public void removeText(WebElement element){
        getWait().until(ExpectedConditions.visibilityOf(element)).clear();
    }

}
