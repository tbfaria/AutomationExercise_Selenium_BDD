package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class AccountDeletedPage extends BrowserDriver {

    public static void isAccountDeletedVisible() throws InterruptedException {
        String expectedTitle = "ACCOUNT DELETED!";
        String actualTitle = driver.findElement(By.cssSelector("[data-qa='account-deleted']")).getText();
        assertEquals("The page title doesn't match.",expectedTitle, actualTitle);
    }

    public static void click_accountCreatedContinue_btn() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
    }
}
