package base;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;

abstract public class AbstractBaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void openWindow() {
        driver = new ChromeDriver();
        driver.get("https://novaposhta.ua/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='popup_info']//i[@class='click close btn_x']"))
                .click();
    }

    @Step("Finish set up driver")
    @AfterMethod
    public void after(ITestResult result) {
        int status = result.getStatus();

        if (status == ITestResult.FAILURE || status == ITestResult.SKIP) {
            captureScreen(driver);
        }
        driver.quit();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] captureScreen(WebDriver driver) {
        System.out.println("captureScreen");
        return (((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    public boolean urlContains(String urlPath) {
        return driver.getCurrentUrl().contains(urlPath);
    }

    public void switchToTab(int tabNumber) {
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(tabNumber - 1));
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getPageSource() {
        return driver.getPageSource();
    }
}
