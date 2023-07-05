package tests;

import base.AbstractBaseTest;
import elements.FindDepartmentElements;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FindDepartmentPage;
import pages.HomePage;

public class DepartmentCategoryTest extends AbstractBaseTest {

    @Test
    public void departmentCategoryTest() {
        HomePage homePage = new HomePage(driver);
        FindDepartmentPage findDepartmentPage = new FindDepartmentPage(driver);
        FindDepartmentElements findDepartmentElements = new FindDepartmentElements(driver);

        homePage
                .moveCursorToDepartmentBtn()
                .clickPoshukViddilenniaZaNomerom();

        Assert.assertEquals(getURL(), "https://novaposhta.ua/office/list");

        findDepartmentPage.
                fillOberitNaselenyiPunkt("Луцьк")
                .clickCityLutsk()
                .clickVsiViddilennia()
                .clickViddilenniaLutskN1()
                .clickOchystytyVseBtn()
                .fillOberitNaselenyiPunkt("Ковель")
                .clickCityKovel()
                .clickVsiViddilennia();

        Assert.assertEquals(findDepartmentPage.countOfDepartmentsInDropDown(),
                findDepartmentPage.countOfDepartmentsInTable());

        findDepartmentPage
                .clickViddilenniaN1Table();
        String actualText = findDepartmentElements.getKovelViddilenniaN1Address();
        String exp  = "Адреса: вул. Володимирська, 135";

        Assert.assertEquals(actualText, exp);
        Assert.assertEquals(getURL(),
                "https://novaposhta.ua/office/view/id/1/city/%D0%9A%D0%BE%D0%B2%D0%B5%D0%BB%D1%8C");
    }
}
