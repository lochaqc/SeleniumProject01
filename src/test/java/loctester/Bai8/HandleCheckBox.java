package loctester.Bai8;

import loctester.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckBox extends BaseTest {
    public static void main(String[] args){
        createDriver();

        //Default checkbox
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkboxOne = driver.findElement(By.xpath("//input[@id = 'isAgeSelected']"));

        boolean checkboxStatusBefore = checkboxOne.isSelected();

        System.out.println(checkboxStatusBefore);

        //If not select -> choose checkbox
        if(checkboxStatusBefore==false){
            checkboxOne.click();
        }

        // check result after choose
        boolean checkboxStatusAfter = checkboxOne.isSelected();

        System.out.println(checkboxStatusAfter);

        //check message after choose checkbox
        WebElement message = driver.findElement(By.xpath("//div[@id ='txtAge']"));

        System.out.println(message.isDisplayed());
        System.out.println(message.getText());

        closeDriver();
    }
}
