package loctester.Bai7_WebDriver;

import loctester.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListWebElement extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();

        driver.get("https://app.hrsale.com/");
        driver.findElement(By.xpath("//button[normalize-space() = 'Super Admin']")).click();
        driver.findElement(By.xpath("//button[normalize-space() = 'Login']")).click();
        List<WebElement> listMenu = driver.findElements(By.xpath("//ul[@class='pc-navbar']//li"));
        for(int i=0; i<listMenu.size(); i++){
            System.out.println(listMenu.get(i).getText());
        }
        Thread.sleep(6000);

        closeDriver();

    }
}
