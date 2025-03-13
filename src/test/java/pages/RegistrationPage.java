package pages;
import org.openqa.selenium.By;
import utility.BrowserDriver;
import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {

    public static String page_registration = "//h1[normalize-space()='User Registration Page']";

    public static void visibility_site_page_registration() throws InterruptedException{
        String actualpage = driver.findElement(By.xpath(page_registration)).getText();
        assertEquals(actualpage, "User Registration Page");
    }
    
}
