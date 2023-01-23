package loctester.Bai7_WebDriver;

import loctester.Common.BaseTest;
import org.openqa.selenium.WindowType;

public class AdvancedBrowser extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://anhtester.com");

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://google.com");
        closeDriver();
    }
}
