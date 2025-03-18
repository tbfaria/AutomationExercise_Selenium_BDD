package stepDefinition;
import static pages.AccountDeletedPage.*;
import io.cucumber.java.en.Then;

public class AccountDeletedPage {
    @Then("the user is successfully removed")
    public void theUserIsSuccessfullyRemoved() throws InterruptedException{
        isAccountDeletedVisible();
        click_accountDeletedContinue_btn();
    }
}
