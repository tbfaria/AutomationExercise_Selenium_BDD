package pages;
import org.openqa.selenium.By;
import utility.BrowserDriver;
import static org.junit.Assert.assertEquals;

public class LoginPage extends BrowserDriver {
    public static String username_text_xpath = "//input[@placeholder='Name']";
    public static String email_text_xpath = "//input[@data-qa='signup-email']";
    public static String signup_btn_xpath = "//button[normalize-space()='Signup']";
    public static String newUser_xpath = "//*[@id=\"form\"]/div/div/div[3]/div/h2";

    public static void visibility_newUser() throws InterruptedException{
        String actualText = driver.findElement(By.xpath(newUser_xpath)).getText();
        assertEquals(actualText, "New User Signup!");
    }

    public static void newUserSignup() throws InterruptedException{
        driver.findElement(By.xpath(username_text_xpath)).sendKeys(SignupPage.firstName_data);
        driver.findElement(By.xpath(email_text_xpath)).sendKeys(SignupPage.email_data);
    }

    public static void click_signup_btn() throws InterruptedException {
        driver.findElement(By.xpath(signup_btn_xpath)).click();
    }
}
