package testHomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestHomePage extends HomePage {
    HomePage homePage;
    @BeforeMethod
    public void init(){
        homePage=new HomePage(driver);
    }
    @Test
    public void testHome(){
        clickOnStatusServicesComponents();
    }
}
