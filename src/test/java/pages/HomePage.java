package pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import utility.BrowserDriver;
import static org.junit.Assert.assertEquals;

public class HomePage extends BrowserDriver {
    public static String cookie_consent_class = "fc-cta-consent";
    public static String homepage = "https://automationexercise.com/";
    public static String signIn_link_linktext = "Signup / Login";
    public static String deleteAccount_link_linktext = "Delete Account";

    public static void access_homepage() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(homepage);
        //Thread.sleep(2000);
        driver.findElement(By.className(cookie_consent_class)).click();
    }

    public static void isHomePageVisible() throws InterruptedException {
        String expectedTitle = "Automation Exercise";
        String actualTitle = driver.getTitle();
        assertEquals("The page title doesn't match.", expectedTitle, actualTitle);
    }

    public static void click_signIn_link() throws InterruptedException {
        //Thread.sleep(2000);
        driver.findElement(By.linkText(signIn_link_linktext)).click();
    }

    public static void click_deleteAccount_link() throws InterruptedException {
        //Thread.sleep(2000);
        driver.findElement(By.linkText(deleteAccount_link_linktext)).click();
    }

    public static void click_accountDeleteContinue_btn() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
    }


}
