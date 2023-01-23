package loctester.Bai6_WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.StaleElementReferenceException;

import java.sql.SQLOutput;
import java.time.Duration;

public class LoginCMS {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Login CMS
        driver.get("https://demo.activeitzone.com/ecommerce/login");

        //Detect web element email (Object)
        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("admin@example.com");
        System.out.println("get text of email box: "+ inputEmail.getText());
        System.out.println("get name of email box: "+ inputEmail.getAttribute("name"));
        driver.findElement(By.id("password")).sendKeys("123456");

        Thread.sleep(2000);

        WebElement checkboxRemember = driver.findElement(By.id("remember"));
        System.out.println("Selected: " + checkboxRemember.isSelected());

        driver.findElement(By.xpath("//span[normalize-space() = 'Remember Me']")).click();


        Thread.sleep(2000);
        //WebElement checkboxRemember = driver.findElement(By.id("remember"));
        System.out.println("Selected: " + checkboxRemember.isSelected());

        // get text
        WebElement title = driver.findElement(By.xpath("//div[@class = 'card-body']//h1"));
        System.out.println(title.getText());
        Thread.sleep(2000);
        //inputEmail.clear();
        WebElement buttonCopy = driver.findElement(By.xpath("//button[normalize-space()='Copy']"));
        System.out.println("Status of Copy button: " + buttonCopy.isDisplayed());

        WebElement buttonLogin = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        System.out.println("background color: " + buttonLogin.getCssValue("background-color"));
        Dimension dimesions = buttonLogin.getSize();
        System.out.println("height: "+ dimesions.height + " width: " + dimesions.width );
        org.openqa.selenium.Point point = buttonLogin.getLocation();
        System.out.println("X cordinate: "+point.x+ " Y cordinate: "+point.y);
        if(buttonLogin.isDisplayed() == true){
            buttonLogin.submit();
        }
        Thread.sleep(2000);
        //Tắt browser
        driver.quit();
    }
}
