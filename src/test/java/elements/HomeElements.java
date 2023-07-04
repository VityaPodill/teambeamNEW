package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeElements extends AbstractBasePage {

    public HomeElements(WebDriver driver) {
        super(driver);
    }

    private static final String NOVA_POST_BTN = "//a[text()='Nova Post']";
    protected WebElement getNovaPostElement() {
        return waitUntilElementToBeClickableByXpath(NOVA_POST_BTN);
    }
    protected final static String CLOSE_COOKIE = "//div[@id='popup_info']//i[@class='click close btn_x']";
    private static final String DEPARTMENT_BTN = "//a[contains(text (), 'Відділення')]";
    protected final static String POSHUK_VIDDILENNIA_ZA_NOMEROM = "//a[contains(text (), 'Пошук відділення за номером')]";

    protected WebElement getPoshukViddilenniaZaNomerom() {
        return waitUntilElementToBeClickableByXpath(POSHUK_VIDDILENNIA_ZA_NOMEROM);
    }

    protected WebElement getDepartmentBtn() {
        return waitUntilElementToBeVisibleByXpath(DEPARTMENT_BTN);
    }
}