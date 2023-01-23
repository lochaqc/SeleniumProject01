package loctester.Bai6_WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckElementEnabled {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Login CMS
        driver.get("https://www.dofactory.com/html/button/disabled");
        WebElement buttonClickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
        System.out.println(buttonClickMe.isEnabled());

        WebElement buttonTry = driver.findElement(By.xpath("(//button[normalize-space()='Try it live'])[1]"));
        System.out.println(buttonTry.isEnabled());
        driver.quit();
    }
}
