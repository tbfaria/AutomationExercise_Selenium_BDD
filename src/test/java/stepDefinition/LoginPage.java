package stepDefinition;
import io.cucumber.java.en.When;
import static pages.LoginPage.*;

public class LoginPage {
    @When("User clicks the registration button")
    public void user_clicks_the_registration_button() throws InterruptedException {
        //click_registration_btn();
    }

    @When("User enters signup details")
    public void userEntersSignupDetails() throws InterruptedException {
        newUserSignup();
    }

    @When("creates a new account")
    public void createsANewAccount() throws InterruptedException{
        visibility_newUser();
        newUserSignup();
        click_signup_btn();
    }
}
