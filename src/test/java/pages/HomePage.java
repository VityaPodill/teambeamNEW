package pages;

import elements.HomeElements;
import org.openqa.selenium.WebDriver;

import static base.CommonActions.moveCursor;

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

    public HomePage moveCursorToDepartmentBtn() {
        moveCursor(getDepartmentBtn(), driver);
        return this;
    }

    public HomePage clickPoshukViddilenniaZaNomerom() {
        getPoshukViddilenniaZaNomerom().click();
        return this;
    }
}