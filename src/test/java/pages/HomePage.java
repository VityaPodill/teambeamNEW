package pages;

import elements.HomeElements;
import org.openqa.selenium.WebDriver;

public class HomePage extends HomeElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickNovaPostBtn() {
        getNovaPostElement().click();
        return this;
    }
    public HomePage closeCookie() {
        waitUntilElementToBeClickableByXpath(CLOSE_COOKIE).click();
        return this;
    }
}