package loctester.Bai8;

import loctester.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleStaticDropdownList extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement selectElement = driver.findElement(By.xpath("//select[@id='select-demo']"));
        //init select object
        Select select = new Select(selectElement);
        System.out.println("Check type of Select: " + select.isMultiple());
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("Number of options in Select: " + select.getOptions().size());

        //get option of class select
        select.selectByVisibleText("Wednesday");
        sleep(1);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByValue("Monday");
        sleep(1);
        System.out.println(select.getFirstSelectedOption().getText());

        select.selectByIndex(6);
        sleep(1);
        System.out.println(select.getFirstSelectedOption().getText());

        closeDriver();
    }
}
