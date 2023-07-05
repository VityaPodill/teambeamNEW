package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindDepartmentElements extends AbstractBasePage {
    public FindDepartmentElements(WebDriver driver) {
        super(driver);
    }

    private static final String OBERIT_NASELENYI_PUNKT = "//input[@placeholder='Оберіть насел. пункт']";
    private static final String NASELENYI_PUNKT_FROM_LIST_LUTSK = "//span[contains(text() , 'м. Луцьк, Волинська обл.')]";
    private static final String VSI_VIDDILENNIA = "//input[@placeholder='Всі відділення']";
    private static final String VIDDILENNIA_LUTSK_N1 = "//span[contains(text(), 'Луцьк №1 (Вантажне відділення)')]";
    private static final String OCHYSTYTY_VSE_BTN = "//a[@id='oClearAll']";
    private static final String NASELENYI_PUNKT_FROM_LIST_KOVEL = "//span[contains(text (), 'м. Ковель, Ковельський р-н, Волинська обл.')]";
    private static final String DROP_DOWN_VIDDILENNIA_LIST = "//ul[@id='o_warehouses']/*[@data-warehouse-ref!='']";
    private static final String TABLE_VIDDILENNIA_LIST = "//table[@class='offices o_offices']/tbody/tr";
    private static final String VIDDILENNIA_N1_TABLE = "//span[contains (text (), 'Відд                    1 ')]";
    private static final String KOVEL_VIDDILENNIA_N1_ADDRESS = "//p/b[contains(text(), 'Адреса:')]/..";

    public String getKovelViddilenniaN1Address() {
        return waitUntilElementToBeVisibleByXpath(KOVEL_VIDDILENNIA_N1_ADDRESS).getText();
    }

    protected WebElement getViddilenniaN1Table() {
        return waitUntilElementToBeVisibleByXpath(VIDDILENNIA_N1_TABLE);
    }

    protected List<WebElement> getDropDownViddilenniaList() {
        return waitUntilPresenceOfAllElementsByXpath(DROP_DOWN_VIDDILENNIA_LIST);
    }

    protected List<WebElement> getTableViddilenniaList() {
        return listWaitUntilElementsToBeVisibleByXpath(TABLE_VIDDILENNIA_LIST);
    }

    protected WebElement getOchystytyVseBtn() {
        return waitUntilElementToBeVisibleByXpath(OCHYSTYTY_VSE_BTN);
    }

    protected WebElement getViddilenniaLutskN1() {
        return waitUntilElementToBeVisibleByXpath(VIDDILENNIA_LUTSK_N1);
    }

    protected WebElement getVsiViddilennia() {
        return waitUntilElementToBeVisibleByXpath(VSI_VIDDILENNIA);
    }

    protected WebElement getOberitNaselenyiPunkt() {
        return waitUntilElementToBeVisibleByXpath(OBERIT_NASELENYI_PUNKT);
    }

    protected WebElement getNaselenyiPunktFromListLutsk() {
        return waitUntilElementToBeVisibleByXpath(NASELENYI_PUNKT_FROM_LIST_LUTSK);
    }

    protected WebElement getNaselenyiPunktFromListKovel() {
        return waitUntilElementToBeVisibleByXpath(NASELENYI_PUNKT_FROM_LIST_KOVEL);
    }
}