package stepDefinition;
import io.cucumber.java.en.When;
import static pages.LoginPage.*;

public class LoginPage {
    @When("User clicks the registration button")
    public void user_clicks_the_registration_button() throws InterruptedException {
        click_registration_btn();
    }

    @When("User enters signup details")
    public void userEntersSignupDetails() throws InterruptedException {
        sendKeys_username();
        sendKeys_email();
        click_login_btn();
    }
}
