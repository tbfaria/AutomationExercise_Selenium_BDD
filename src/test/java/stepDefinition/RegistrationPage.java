package stepDefinition;
import io.cucumber.java.en.Then;
import static pages.RegistrationPage.*;

public class RegistrationPage {



    @Then("User should be able to view the Registration page")
    public void user_should_be_able_to_view_the_registration_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        visibility_site_page_registration();
    }
}
