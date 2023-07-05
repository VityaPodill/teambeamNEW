package pages;

import elements.DeliveryElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.CommonActions.moveCursor;
import static java.lang.Thread.sleep;

public class DeliveryPage extends DeliveryElements {

    public DeliveryPage(WebDriver driver) {
        super(driver);
    }

    public DeliveryPage moveDepartmetn() {
        moveCursor(waitUntilElementToBeVisibleByXpath(DEPARTMENT_BUTTON), driver);
        return this;
    }

    public DeliveryPage clickFindDepartmentButton() {
        waitUntilElementToBeClickableByXpath(FIND_DEPARTMENT_BUTTON).click();
        return this;
    }


    public DeliveryPage clickDeliveryButton() {
        waitUntilElementToBeClickableByXpath(DELIVERY_BUTTON).click();
        return this;
    }

    public WebElement getDateTimeField() {
        return waitUntilElementToBeVisibleByXpath(GET_TIME);
    }

    public WebElement fieldTime() {
        return waitUntilElementToBeVisibleByXpath(FIELD_TIME);
    }

    public DeliveryPage clickTimeButton() {
        waitUntilElementToBeClickableByXpath(TIME_BUTTON).click();
        return this;
    }

    public DeliveryPage enterInputTime() {
        waitUntilElementToBeClickableByXpath(TIME_BUTTON).sendKeys(Keys.ENTER);
        return this;
    }


    public WebElement inputService() {
        return waitUntilElementToBeVisibleByXpath(INPUT_SERVICE);
    }
    public WebElement citySender() {
        return waitUntilElementToBeVisibleByXpath(CITY_SENDER);
    }
    public WebElement recipientCity() {
        return waitUntilElementToBeVisibleByXpath(RECIPIENT_CITY);
    }


    public DeliveryPage clickTypeServiceButton() {
        waitUntilElementToBeClickableByXpath(INPUT_SERVICE).click();
        return this;
    }

    public DeliveryPage clickCitySenderButton() {
        waitUntilElementToBeClickableByXpath(CITY_SENDER).click();
        return this;
    }
    public DeliveryPage clickRecipientButton() {
        waitUntilElementToBeClickableByXpath(RECIPIENT_CITY).click();
        return this;
    }
    public DeliveryPage clickWarehouseButton() {
        waitUntilElementToBeClickableByXpath(WAREHOUSE_BUTTON).click();
        return this;
    }
    public DeliveryPage clickKyivButton() throws InterruptedException {
        waitUntilElementToBeClickableByXpath(KYIV_BUTTON).click();
        sleep(2000);
        return this;
    }
    public DeliveryPage clickLvivButton() throws InterruptedException {
        waitUntilElementToBeClickableByXpath(LVIV_BUTTON).click();
        sleep(2000);
        return this;
    }
    public DeliveryPage clickCalculateDateButton() {
        waitUntilElementToBeClickableByXpath(CALCULATE_DATE_BUTTON).click();
        return this;
    }
    public WebElement getTimeDelivery() {
        return waitUntilElementToBeVisibleByXpath(TIME_DELIVERY);
    }

}
