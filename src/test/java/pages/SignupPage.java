package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BrowserDriver;
import static org.junit.Assert.assertEquals;

public class SignupPage extends BrowserDriver {
    public static String mr_radio_xpath = "//input[@id='id_gender1']";
    public static String name_xpath = "//input[@id='name']";
    public static String password_xpath = "//input[@id='password']";
    public static String birthDay_xpath = "//select[@id='days']";
    public static String birthMonth_xpath = "//select[@id='months']";
    public static String birthYear_xpath = "//select[@id='years']";
    public static String firstName_xpath = "//input[@id='first_name']";
    public static String lastName_xpath = "//input[@id='last_name']";
    public static String address_xpath = "//input[@id='address1']";
    public static String country_xpath = "//select[@id='country']";
    public static String state_xpath = "//input[@id='state']";
    public static String city_xpath = "//input[@id='city']";
    public static String zipCode_xpath = "//input[@id='zipcode']";
    public static String mobileNumber_xpath = "//input[@id='mobile_number']";
    public static String createAccount_btn_xpath = "//button[normalize-space()='Create Account']";

    public static String name_data = "Norman E. Sargent";
    public static String email_data = "NormanESargent@teleworm.us";
    public static String password_data = "password";
    public static int birth_day_data = 21;
    public static int birth_month_data = 9;
    public static String birth_year_data = "1947";
    public static String firstName_data = "Norman";
    public static String lastName_data = "Sargent";
    public static String address_data = "1451 Coplin Avenue";
    public static String country_data = "United States";
    public static String state_data = "Arizona";
    public static String city_data = "Pheonix";
    public static String zipCode_data = "85003";
    public static String mobileNumber_data = "6024762652";

    public static String deleteAccount_link_linktext = "Delete Account";

    public static void visibility_site_page_signup() throws InterruptedException{
        String expectedTitle = "Automation Exercise - Signup";
        String actualTitle = driver.getTitle();
        assertEquals("The page title doesn't match.", expectedTitle, actualTitle);
    }

    public static void new_user_signup() throws InterruptedException{

        driver.findElement(By.xpath(mr_radio_xpath)).click();
        driver.findElement(By.xpath(name_xpath)).clear();
        driver.findElement(By.xpath(name_xpath)).sendKeys(name_data);
        driver.findElement(By.xpath(password_xpath)).sendKeys(password_data);

        new Select(driver.findElement(By.xpath(birthDay_xpath))).selectByIndex(birth_day_data);
        new Select(driver.findElement(By.xpath(birthMonth_xpath))).selectByIndex(birth_month_data);
        new Select(driver.findElement(By.xpath(birthYear_xpath))).selectByValue(birth_year_data);

        driver.findElement(By.xpath(firstName_xpath)).sendKeys(firstName_data);
        driver.findElement(By.xpath(lastName_xpath)).sendKeys(lastName_data);
        driver.findElement(By.xpath(address_xpath)).sendKeys(address_data);

        new Select(driver.findElement(By.xpath(country_xpath))).selectByValue(country_data);
        driver.findElement(By.xpath(state_xpath)).sendKeys(state_data);
        driver.findElement(By.xpath(city_xpath)).sendKeys(city_data);
        driver.findElement(By.xpath(zipCode_xpath)).sendKeys(zipCode_data);
        driver.findElement(By.xpath(mobileNumber_xpath)).sendKeys(mobileNumber_data);

    }

    public static void click_createAccount_btn() throws InterruptedException {
        // navigates until de button is visible
        WebElement footer = driver.findElement(By.cssSelector("[data-qa='create-account']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", footer);
    }

    public static void click_continueCreateAccount_btn() throws InterruptedException {
        driver.findElement(By.cssSelector("[data-qa='create-account']")).click();
    }

    public static void isAccountCreatedVisible() throws InterruptedException {
        String expectedTitle = "ACCOUNT CREATED!";
        String actualTitle = driver.findElement(By.cssSelector("[data-qa='account-created']")).getText();
        assertEquals("The page title doesn't match.",expectedTitle, actualTitle);
    }

    public static void click_accountCreatedContinue_btn() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
    }



}
