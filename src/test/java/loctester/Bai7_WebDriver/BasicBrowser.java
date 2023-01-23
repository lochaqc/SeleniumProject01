package loctester.Bai7_WebDriver;

import loctester.Common.BaseTest;
import org.openqa.selenium.By;

public class BasicBrowser extends BaseTest {
    public static void main(String[] args){
        createDriver();
        // Navigate to a page
        driver.navigate().to("http://anhtester.com");
        driver.findElement(By.id("btn-login")).click();
        sleep(2);
        // Điều hướng về lịch sử trang trước đó
        driver.navigate().back();
        sleep(2);
        // Làm mới trang hiện tại
        driver.navigate().refresh();
        sleep(2);
        // Điều hướng đến trang tiếp sau
        driver.navigate().forward();
        sleep(2);
        // Get the title of the page
        String title = driver.getTitle();
        // Get the current URL
        String url = driver.getCurrentUrl();
        // Get the current page HTML source
        String html = driver.getPageSource();

        closeDriver();

    }
}
