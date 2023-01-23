package loctester.Bai7_WebDriver;

import loctester.Common.BaseTest;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class InterfaceOption extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://anhtester.com");
        // Add a new cookie
        Cookie newCookie = new Cookie("customName", "0123456789");
        driver.manage().addCookie(newCookie);
        System.out.println(driver.manage().getCookieNamed("customName"));

        // Get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.toString());

        // Delete a cookie by name
        //driver.manage().deleteCookieNamed("CookieName");

        // Delete all cookies
        //driver.manage().deleteAllCookies();
        closeDriver();
    }

}
