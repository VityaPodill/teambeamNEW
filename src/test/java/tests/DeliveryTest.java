package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DeliveryPage;

import java.time.LocalDateTime;
import java.time.Month;
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

        String dataTimeDelivery = departmentPage.getTimeDelivery().getText();

        String[] data_delivery_array = dataTimeDelivery.split(" ");
        int month_number = enumMonth.monthByString(data_delivery_array[1]).getNumber();
        String dateTimeDeliveryText = addZeroToDate(data_delivery_array[0])+
                "."+addZeroToDate(Integer.toString(month_number))+
                "."+data_delivery_array[2]+" "+data_delivery_array[3];

        LocalDateTime dateTimeDelivery = LocalDateTime.parse(dateTimeDeliveryText, formatter);

        int compareDatesResult = dateTimeDelivery.compareTo(dateTimeFromField);
        Assert.assertTrue(compareDatesResult > 0);
    }

    public String addZeroToDate(String date){
        if(date.length()<2){
            return "0"+date;
        }
        return date;
    }

}

