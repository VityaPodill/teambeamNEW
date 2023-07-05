package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.DeliveryPage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DeliveryTest extends AbstractBaseTest {
    @Test
    public void deliveryTest() throws InterruptedException {
        DeliveryPage departmentPage = new DeliveryPage(driver);

        departmentPage
                .clickDeliveryButton();

        assertEquals(driver.getCurrentUrl(), "https://novaposhta.ua/onlineorder/estimatedate");


        departmentPage
                .clickTimeButton()
                .enterInputTime();

        String dateTimeText = departmentPage.getDateTimeField().getAttribute("value");
        LocalDateTime currentDateTime = LocalDateTime.now();
        String timeNow = String.valueOf(LocalDateTime.now());


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        LocalDateTime dateTimeFromField = LocalDateTime.parse(dateTimeText, formatter);
        System.out.println(dateTimeFromField);


        System.out.println(LocalDateTime.now());
        assertTrue(timeNow.contains(dateTimeFromField.toString()));

        assert departmentPage.inputService().getAttribute("value").isEmpty() : "Елемент є непорожнім";
        assert departmentPage.citySender().getAttribute("value").isEmpty() : "Елемент є непорожнім";
        assert departmentPage.recipientCity().getAttribute("value").isEmpty() : "Елемент є непорожнім";

        departmentPage
                .clickTypeServiceButton()
                .clickWarehouseButton()
                .clickCitySenderButton()
                .clickKyivButton()
                .clickRecipientButton()
                .clickLvivButton()
                .clickCalculateDateButton();

        String DataTimeDelivery = departmentPage.getTimeDelivery().getText();
        System.out.println(DataTimeDelivery);

    }
}
