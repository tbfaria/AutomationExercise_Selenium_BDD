package pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class HomePage extends BrowserDriver {



    //public static String onlineProducts_link_linktext = "Online Products";
    public static String cookie_consent_class = "fc-cta-consent";
    public static String homepage = "https://automationexercise.com/";
    public static String signIn_link_linktext = "Signup / Login";


    public static void access_homepage() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(homepage);
        Thread.sleep(2000);
        driver.findElement(By.className(cookie_consent_class)).click();
    }

    public static void click_signIn_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(signIn_link_linktext)).click();
    }

    public static void click_hamburger_menu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com");
        Thread.sleep(2000);
        driver.findElement(By.className(cookie_consent_class)).click();
    }

    public static boolean isHomePageVisible() {
        return driver.getCurrentUrl().equals(homepage);  // Substitua pela URL real
    }

    public static void click_onlineProducts_link() throws InterruptedException {
        Thread.sleep((2000));
        //driver.findElement(By.linkText(onlineProducts_link_linktext)).click();
    }
}
