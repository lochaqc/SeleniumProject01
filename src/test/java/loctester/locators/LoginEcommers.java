package loctester.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginEcommers {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //open webpage
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        Thread.sleep(1000);
        //Input email and password
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.name("password")).sendKeys("mycode");
        driver.findElement(By.linkText("Forgot password ?")).click();
        Thread.sleep(2000);
        //Tắt browser
        driver.quit();
    }
}
