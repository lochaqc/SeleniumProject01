package loctester;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class TestSelenium{
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang anhtester.com
        driver.get("https://anhtester.com/");
        Thread.sleep(1000);

        //Click Website testing
        driver.findElement(By.xpath("//h3[normalize-space()='Website Testing']")).click();

        Thread.sleep(1000);


        //Click to course
        driver.findElement(By.xpath("//img[@alt='Website Testing With Katalon Basic To Advanced']")).click();

        String description = driver.findElement(By.xpath("//h2[contains(text(),'Xin chào các bạn. Khóa học Website Automation Test')]")).getText();

        System.out.println(description);



        //Tắt browser
        driver.quit();
    }
}
