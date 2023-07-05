package elements;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;

public class DeliveryElements extends AbstractBasePage {
    public DeliveryElements(WebDriver driver) {
        super(driver);
    }
    protected final static String DEPARTMENT_BUTTON = "//a[@href='/office']";
    protected final static String FIND_DEPARTMENT_BUTTON = "//a[contains(text(),'Пошук відділення за номером ')]";
    protected final static String DELIVERY_BUTTON = "//a[@href='/onlineorder/estimatedate']";
    protected final static String GET_TIME = "//input[@id='pickdatetime_today']";
    protected final static String FIELD_TIME = "//input[@class='autocomplete city error']";
    protected final static String TIME_BUTTON = "//input[@id='pickdatetime_today']";
    protected final static String INPUT_SERVICE = "//input[@id='EstimateDateForm_serviceType']";
    protected final static String CITY_SENDER = "//input[@id='EstimateDateForm_senderCity']";
    protected final static String RECIPIENT_CITY = "//input[@id='EstimateDateForm_recipientCity']";
    protected final static String WAREHOUSE_BUTTON = "//li[@id='WarehouseWarehouse']";
    protected final static String KYIV_BUTTON = "//ul[@id='ulSenderCity']/li[4]/span";
    protected final static String LVIV_BUTTON = "//ul[@id='ulRecipientCity']/li[6]/span";
    protected final static String CALCULATE_DATE_BUTTON = "//input[@value='Розрахувати дату']";
    protected final static String TIME_DELIVERY = "//div[@class='highlight']";

}
