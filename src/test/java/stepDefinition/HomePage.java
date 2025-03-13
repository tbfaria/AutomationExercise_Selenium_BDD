package stepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static pages.HomePage.*;

public class HomePage {
    @Given("User navigates to the Login page")
    public void user_navigates_to_the_Login_page() throws InterruptedException {
        click_hamburger_menu();
        click_signIn_link();
    }

    @Given("User navigates to Online product page")
    public void userNavigatesToOnlineProductPage() throws InterruptedException {
        click_hamburger_menu();
        click_onlineProducts_link();
    }

    @Given("I am on the Home Page")
    public void iAmOnTheHomePage() throws InterruptedException{
        access_homepage();
    }

    @Then("the Home Page should be visible")
    public void the_home_page_should_be_visible() throws InterruptedException{
        Assert.assertTrue("Home Page is not visible!", isHomePageVisible());
    }


    @Given("User navigates to the SignupLogin page")
    public void userNavigatesToTheSignupLoginPage() throws InterruptedException {
        access_homepage();
        click_signIn_link();
    }


}
