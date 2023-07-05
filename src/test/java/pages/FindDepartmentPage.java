package pages;

import elements.FindDepartmentElements;
import org.openqa.selenium.WebDriver;

public class FindDepartmentPage extends FindDepartmentElements {
    public FindDepartmentPage(WebDriver driver) {
        super(driver);
    }

    public FindDepartmentPage clickViddilenniaN1Table() {
        getViddilenniaN1Table().click();
        return this;
    }

    public FindDepartmentPage fillOberitNaselenyiPunkt(String city) {
        getOberitNaselenyiPunkt().sendKeys(city);
        return this;
    }

    public FindDepartmentPage clickCityKovel() {
        getNaselenyiPunktFromListKovel().click();
        return this;
    }

    public FindDepartmentPage clickCityLutsk() {
        getNaselenyiPunktFromListLutsk().click();
        return this;
    }

    public FindDepartmentPage clickVsiViddilennia() {
        getVsiViddilennia().click();
        return this;
    }

    public FindDepartmentPage clickViddilenniaLutskN1() {
        getViddilenniaLutskN1().click();
        return this;
    }

    public FindDepartmentPage clickOchystytyVseBtn() {
        getOchystytyVseBtn().click();
        return this;
    }

    public int countOfDepartmentsInDropDown() {
        return getDropDownViddilenniaList().size();
    }

    public int countOfDepartmentsInTable() {
        return getTableViddilenniaList().size();
    }
}
