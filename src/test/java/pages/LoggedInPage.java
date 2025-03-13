package pages;
import org.openqa.selenium.By;
import utility.BrowserDriver;
import static org.junit.Assert.assertEquals;

public class LoggedInPage extends BrowserDriver {
    public static String productCategory_formalshoes = "//h3[@id='ShoeType' and text()='Formal Shoes']";
    public static String productCategory_sportsshoes = "//h3[@id='ShoeType' and text()='Sports']";
    public static String productCategory_sneakers = "//h3[@id='ShoeType' and text()='Sneakers']";

    public static void visibility_productcategory_formalshoes() throws InterruptedException{
        String actualproductcategory_fs = driver.findElement(By.xpath(productCategory_formalshoes)).getText();
        assertEquals(actualproductcategory_fs, "Formal Shoes");
    }

    public static void visibility_productcategory_sportshoes() throws InterruptedException{
        String actualproductcategory_ss = driver.findElement(By.xpath(productCategory_sportsshoes)).getText();
        assertEquals(actualproductcategory_ss, "Sports");
    }

    public static void visibility_productcategory_sneakers() throws InterruptedException{
        String actualproductcategory_s = driver.findElement(By.xpath(productCategory_sneakers)).getText();
        assertEquals(actualproductcategory_s, "Sneakers");
    }
}
