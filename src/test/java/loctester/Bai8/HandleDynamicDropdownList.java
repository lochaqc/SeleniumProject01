package loctester.Bai8;

import loctester.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

public class HandleDynamicDropdownList extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        sleep(2);

        //Click vào dropdown Category
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();

        //search
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Hotels");
        sleep(3);

        //click text
        //driver.findElement(By.xpath("//li[@class='active-result highlighted']")).click();

        //click Enter
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();

        closeDriver();
    }
}
