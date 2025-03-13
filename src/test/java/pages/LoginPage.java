package pages;
import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoginPage extends BrowserDriver {
    public static String username_text_xpath = "//input[@placeholder='Name']";
    public static String email_text_xpath = "//input[@data-qa='signup-email']";
    public static String signup_btn_xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button";
    public static String registration_btn_xpath = "//a[normalize-space()='Signup / Login']";

    //novo
    public static String newUser_xpath = "//*[@id=\"form\"]/div/div/div[3]/div/h2";

    public static void click_registration_btn() throws InterruptedException {
        driver.findElement(By.xpath(registration_btn_xpath)).click();
    }

    //novo
    public static void visibility_newUser() throws InterruptedException{
        String actualText = driver.findElement(By.xpath(newUser_xpath)).getText();
        assertEquals(actualText, "New User Signup!");
    }

    public static void sendKeys_username() throws InterruptedException{
        driver.findElement(By.xpath(username_text_xpath)).sendKeys("John");
    }

    public static void sendKeys_email() throws InterruptedException{
        driver.findElement(By.xpath(email_text_xpath)).sendKeys("john@email.com");
    }

    public static void click_login_btn() throws InterruptedException{
        driver.findElement(By.xpath(signup_btn_xpath)).click();
    }

}
