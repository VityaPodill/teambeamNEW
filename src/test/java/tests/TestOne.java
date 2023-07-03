package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestOne extends AbstractBaseTest {
    @Test
    public void test() {
        HomePage homePage = new HomePage(driver);
        homePage.clickNovaPostBtn();
    }
}
