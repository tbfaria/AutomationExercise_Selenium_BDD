package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class OnlineProductsPage extends BrowserDriver {

    public static String formalShoes_dropdown_class = "formalshoedropdown";

    public static String formalShoes_webtable = "/html/body/div[2]/table";

    public static String formalShoes_webtable_tr = "/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static void click_formalShoes_btn() throws InterruptedException {
        driver.findElement(By.className(formalShoes_dropdown_class)).click();
    }

    public static String getText_formalShoes_firstValue()  {
        return driver.findElement(By.xpath(formalShoes_webtable_tr)).getText();

    }
}
