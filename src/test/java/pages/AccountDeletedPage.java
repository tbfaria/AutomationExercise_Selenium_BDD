package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class AccountDeletedPage extends BrowserDriver {
    public static String accountDeleted_text_xpath = "//*[@data-qa='account-deleted']";
    public static String accountDeleted_button_xpath = "//*[@id=\"form\"]/div/div/div/div/a";

    public static void isAccountDeletedVisible() throws InterruptedException {
        String expectedTitle = "ACCOUNT DELETED!";
        String actualTitle = driver.findElement(By.xpath(accountDeleted_text_xpath)).getText();
        assertEquals("The page title doesn't match.",expectedTitle, actualTitle);
    }

    public static void click_accountDeletedContinue_btn() throws InterruptedException {
        driver.findElement(By.xpath(accountDeleted_button_xpath)).click();
    }

    public static void click_accountDeleteContinue_btn() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
    }
}
