package stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static pages.SignupPage.*;

public class SignupPage {

    @Given("I am on the registration page")
    public void iAmOnTheRegistrationPage() throws InterruptedException {
        visibility_site_page_signup();
        pages.HomePage.access_homepage();
    }

    @Then("the user is successfully created")
    public void theUserIsSuccessfullyCreated() throws InterruptedException{
        visibility_site_page_signup();
        new_user_signup();
        click_createAccount_btn();
        click_continueCreateAccount_btn();
        isAccountCreatedVisible();
        click_accountCreatedContinue_btn();
    }

}
