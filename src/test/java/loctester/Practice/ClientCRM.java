package loctester.Practice;

import loctester.Common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class ClientCRM extends BaseTest {
    //login to CRM system
    public static void signinCRM() {
        driver.get("https://rise.fairsketch.com/signin");
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        sleep(2);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@demo.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
    }

    public static void openClientPage(){
        sleep(2);
        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
        sleep(2);
        driver.findElement(By.xpath("//div[@id='page-content']//a[normalize-space()='Clients']")).click();
        sleep(2);

    }

    public static void enterDataAddClient(String clientName){
        driver.findElement(By.xpath("//a[normalize-space()='Add client']")).click();
        sleep(2);
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys(clientName);
        sleep(1);
        //driver.findElement(By.xpath("")).sendKeys("");
        driver.findElement(By.xpath("//div[@id='s2id_created_by']")).click();
        sleep(1);
        driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("Sara Ann", Keys.ENTER);
        driver.findElement(By.id("address")).sendKeys("District 7");
        driver.findElement(By.id("city")).sendKeys("Ho Cho Minh");
        driver.findElement(By.id("state")).sendKeys("");
        driver.findElement(By.id("zip")).sendKeys("+84");

        //Scrolling bar to "Country" element (Cus this element is covered)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.id("country")));

        driver.findElement(By.id("country")).sendKeys("Vietnam");


        js.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.id("vat_number")));
        driver.findElement(By.id("phone")).sendKeys("0394072088");
        driver.findElement(By.id("website")).sendKeys("https://anhtester.com/");
        driver.findElement(By.id("vat_number")).sendKeys("123456789");

        js.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//label[normalize-space()='Disable online payment']")));
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']")).click();
        sleep(1);
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']//input")).sendKeys("VIP", Keys.ENTER);
        sleep(1);

        driver.findElement(By.xpath("//div[@id='s2id_currency']")).click();
        sleep(1);
        driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("USD", Keys.ENTER);
        sleep(1);
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
    }

    public static void checkClientAfterAdded(String clientName){
        sleep(2);
        driver.findElement(By.xpath("//div[@id='client-table_filter']//input")).sendKeys(clientName, Keys.ENTER);
        sleep(2);
        String clientNameInTable = driver.findElement(By.xpath("//table[@id='client-table']//tbody//tr[1]/td[2]")).getText();
        System.out.println(clientNameInTable);
    }

    public static void main(String[] args) {
        createDriver();

        signinCRM();

        openClientPage();

        enterDataAddClient("Henry King");

        checkClientAfterAdded("Henry King");

        closeDriver();
    }
}
