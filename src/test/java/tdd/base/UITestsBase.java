package tdd.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import tdd.utility.seleniumUtilities;

public class UITestsBase extends seleniumUtilities {
@BeforeMethod
    public void initializationTest(){
    openBrowser();
}

@AfterMethod
public void testClosure(){
    closeBrowser();
}
}
