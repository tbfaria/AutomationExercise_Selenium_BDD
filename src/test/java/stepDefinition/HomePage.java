package stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static pages.HomePage.*;
import static pages.SignupPage.*;
public class HomePage {

    @Given("user navigates to the signup page")
    public void userNavigatesToTheSignupPage() throws InterruptedException{
        access_homepage();
        isHomePageVisible();
        click_signIn_link();
    }

    @And("I delete the created user")
    public void iDeleteTheCreatedUser() throws InterruptedException{
        click_deleteAccount_link();
        click_accountDeleteContinue_btn();
    }


}
